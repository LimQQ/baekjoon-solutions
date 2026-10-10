import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);

        int[] board = new int[101]; // 보드 초기화
        for(int i = 0; i <= 100; i++){
            board[i] = 0;
        }
        for(int i = 0; i < n + m; i++){
            String[] temp = br.readLine().split(" ");
            int s = Integer.parseInt(temp[0]), e = Integer.parseInt(temp[1]);
            board[s] = e;
        }

        Queue<me> queue = new LinkedList<>();
        queue.add(new me(1, 0));
        boolean alreadyMoved;
        while(!queue.isEmpty()){
            me t = queue.poll();
            alreadyMoved = false;
            for(int i = 6; i > 0; i--){
                if(t.location + i < 100) {
                    if (!alreadyMoved && board[t.location + i] == 0){
                        queue.add(new me(t.location + i, t.diceCnt + 1));
                        alreadyMoved = true;
                    }
                    else if (board[t.location + i] != 0){
                        queue.add(new me(board[t.location + i], t.diceCnt + 1));
                    }
                }
                else if(t.location + i == 100){
                    System.out.println(t.diceCnt + 1);
                    queue.clear();
                    break;
                }
            }
        }
    }

    public static class me{
        int location;
        int diceCnt;
        public me(int location, int diceCnt){
            this.location = location;
            this.diceCnt = diceCnt;
        }
    }
}