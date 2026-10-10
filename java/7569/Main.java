import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(" ");
        String[] NMH = br.readLine().split(" ");
        int n = Integer.parseInt(NMH[1]), m = Integer.parseInt(NMH[0]), h = Integer.parseInt(NMH[2]);

        int[][][] tomatoBox = new int[h + 2][n + 2][m + 2];
        Queue<coord> queue = new LinkedList<>();
        int unripedTomato = 0;
        for(int k = 0; k < h + 2; k++){
            for(int i = 0; i < n + 2; i++) { // 토마토박스세팅
                if (i != 0 && i != n + 1 && k != 0 && k != h + 1) {
                    st = new StringTokenizer(br.readLine());
                }
                for (int j = 0; j < m + 2; j++) {
                    if (i == 0 || i == n + 1 || j == 0 || j == m + 1 || k == 0 || k == h + 1) {
                        tomatoBox[k][i][j] = -1;
                    } else {
                        tomatoBox[k][i][j] = Integer.parseInt(st.nextToken());
                        if (tomatoBox[k][i][j] == 1) {
                            queue.add(new coord(k, i, j));
                        }
                        if (tomatoBox[k][i][j] == 0) {
                            unripedTomato++;
                        }
                    }
                }
            }
        }

        int cnt = 0;
        while(!queue.isEmpty()){
            cnt++;
            queue = ripeTomato(tomatoBox, queue);
        }

        if(unripedTomato == ripedTomato){
            System.out.println(cnt - 1);
        }
        else{
            System.out.println(-1);
        }
    }

    static int ripedTomato = 0;
    public static Queue<coord> ripeTomato(int[][][] tomatoBox, Queue<coord> queue){
        Queue<coord> tempQueue = new LinkedList<>();
        while(!queue.isEmpty()){
            coord temp = queue.poll();
            if(tomatoBox[temp.h][temp.x + 1][temp.y] == 0){
                tomatoBox[temp.h][temp.x + 1][temp.y] = 1;
                tempQueue.add(new coord(temp.h, temp.x + 1, temp.y));
                ripedTomato++;
            }
            if(tomatoBox[temp.h][temp.x][temp.y + 1] == 0){
                tomatoBox[temp.h][temp.x][temp.y + 1] = 1;
                tempQueue.add(new coord(temp.h, temp.x, temp.y + 1));
                ripedTomato++;
            }
            if(tomatoBox[temp.h][temp.x - 1][temp.y] == 0){
                tomatoBox[temp.h][temp.x - 1][temp.y] = 1;
                tempQueue.add(new coord(temp.h, temp.x - 1, temp.y));
                ripedTomato++;
            }
            if(tomatoBox[temp.h][temp.x][temp.y - 1] == 0){
                tomatoBox[temp.h][temp.x][temp.y - 1] = 1;
                tempQueue.add(new coord(temp.h, temp.x, temp.y - 1));
                ripedTomato++;
            }
            if(tomatoBox[temp.h + 1][temp.x][temp.y] == 0){
                tomatoBox[temp.h + 1][temp.x][temp.y] = 1;
                tempQueue.add(new coord(temp.h + 1, temp.x, temp.y));
                ripedTomato++;
            }
            if(tomatoBox[temp.h - 1][temp.x][temp.y] == 0){
                tomatoBox[temp.h - 1][temp.x][temp.y] = 1;
                tempQueue.add(new coord(temp.h - 1, temp.x, temp.y));
                ripedTomato++;
            }
        }
        return tempQueue;
    }

    public static class coord{
        int h;
        int x;
        int y;
        public coord(int h, int x, int y){
            this.h = h;
            this.x = x;
            this.y = y;
        }
    }
}