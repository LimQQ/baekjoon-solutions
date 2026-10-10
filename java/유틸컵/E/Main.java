import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int boardSize = Integer.parseInt(st.nextToken());
        land[] board = new land[boardSize * 4 - 3]; // 1이 시작칸인 보드
        int money = Integer.parseInt(st.nextToken()); // 현재 돈
        int worth = Integer.parseInt(st.nextToken()); // 월급
        int goldenKey = Integer.parseInt(st.nextToken()); // 황금열쇠카드의 수
        int landAmount = 0, landCnt = 0; // 도시 땅의 수, 구매한 땅의 수
        int donated = 0; // 기부된 사복기금의 양
        boolean win = false, minusMoney = false; // 승리여부, 파산여부

        Queue<goldenKeyCard> goldenKeyCards = new LinkedList<>();
        for(int i = 0; i < goldenKey; i++){ // 황금열쇠 queue 만들기
            st = new StringTokenizer(br.readLine(), " ");
            int type = Integer.parseInt(st.nextToken());
            int amount = Integer.parseInt(st.nextToken());
            goldenKeyCards.add(new goldenKeyCard(type, amount));
        }

        for(int i = 1; i <= boardSize * 4 - 4; i++){ // 보드 만들기
            //0은 도시 땅, 1은 황금열쇠, 2는 시작, 3은 무인도, 4는 사복기금, 5는 우주여행
            if(i == 1){
                board[i] = new land(2, 0);
            }
            else if(i == boardSize){
                board[i] = new land(3, 0);
            }
            else if(i == boardSize * 2 - 1){
                board[i] = new land(4, 0);
            }
            else if(i == boardSize * 3 - 2){
                board[i] = new land(5, 0);
            }
            else{
                st = new StringTokenizer(br.readLine(), " ");
                if(Objects.equals(st.nextToken(), "L")){
                    board[i] = new land(0, Integer.parseInt(st.nextToken()));
                    landAmount++;
                }
                else{
                    board[i] = new land(1, 0);
                }
            }
        }

        int diceRollCase = Integer.parseInt(br.readLine()); // 주사위 굴리는 횟수
        int location = 1; // 시작위치
        boolean alreadyMoved = false; // 황금열쇠에서 이동 이후 그 땅의 행동을 하기 위한 변수

        while(diceRollCase > 0){
            if(!alreadyMoved){ // 주사위 굴리고 이동
                st = new StringTokenizer(br.readLine(), " ");
                diceRollCase--;
                int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                int move = a + b;
                location += move;
            }

            alreadyMoved = false;

            if(location > 4 * boardSize - 4){ // 출발지점 지나 월급 지급 후 위치 인덱스 조정
                int k = location / (4 * boardSize - 4);
                location = location % (4 * boardSize - 4);
                money += (worth * k);
            }

            if(board[location].type == 0){ //도시 땅 도착
                if(money >= board[location].price && !board[location].have){
                    board[location].have = true;
                    money -= board[location].price;
                    landCnt++;
                }
            }
            else if(board[location].type == 1){ //황금열쇠땅 도착
                if(!goldenKeyCards.isEmpty()){
                    goldenKeyCard t = goldenKeyCards.poll();
                    if(t.type == 1){
                        money += t.amount;
                    }
                    else if(t.type == 2){
                        money -= t.amount;
                    }
                    else if(t.type == 3){
                        money -= t.amount;
                        donated += t.amount;
                    }
                    else if(t.type == 4){
                        location += t.amount;
                        alreadyMoved = true;
                    }
                    goldenKeyCards.add(t);
                }
            }
            else if(board[location].type == 3){ //무인도 도착
                for(int i = 0; i < 3; i++){
                    if(diceRollCase > 0){
                        st = new StringTokenizer(br.readLine(), " ");
                        diceRollCase--;
                        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
                        if(a == b){
                            break;
                        }
                    }
                }
            }
            else if(board[location].type == 4){ //사회복지기금 도착
                money += donated;
                donated = 0;
            }
            else if(board[location].type == 5){ //우주여행 도착
                location = 1;
                money += worth;
            }

            if(money < 0){ //파산
                minusMoney = true;
                break;
            }
        }

        if(landAmount == landCnt && !minusMoney){ // 땅을 모두 구매했고 파산하지 않았다면
            win = true;
        }

        if(win){
            System.out.println("WIN");
        }
        else{
            System.out.println("LOSE");
        }
    }

    public static class goldenKeyCard{
        int type;
        int amount;
        public goldenKeyCard(int type, int amount){
            this.type = type;
            this.amount = amount;
        }
    }

    public static class land{
        int type;
        int price;
        boolean have = false;
        public land(int type, int price){
            this.type = type;
            this.price = price;
        }
    }
}