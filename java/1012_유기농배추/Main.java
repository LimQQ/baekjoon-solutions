import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while(testCase-- != 0){
            String[] MNT = br.readLine().split(" ");
            int m = Integer.parseInt(MNT[0]), n = Integer.parseInt(MNT[1]), t = Integer.parseInt(MNT[2]);
            int[][] visited = new int[m + 2][n + 2], field = new int[m + 2][n + 2];
            for(int i = 0; i < m + 2; i++){
                for(int j = 0; j < n + 2; j++){
                    field[i][j] = 0;
                    if(i == 0 || i == m + 1 || j == 0 || j == n + 1){
                        visited[i][j] = 1;
                    }
                    else{
                        visited[i][j] = 0;
                    }
                }
            }

            while(t-- != 0){
                String[] XY = br.readLine().split(" ");
                field[Integer.parseInt(XY[0]) + 1][Integer.parseInt(XY[1]) + 1] = 1;
            }

            int cnt = 0;

            for(int i = 1; i < m + 1; i++){
                for(int j = 1; j < n + 1; j++){
                    if(field[i][j] == 1 && visited[i][j] != 1){
                        findSameBug(field, visited, i, j);
                        cnt++;
                    }
                }
            }

            result.append(cnt).append("\n");
        }
        System.out.println(result);
    }

    public static void findSameBug(int[][] field, int[][] visited, int x, int y){
        visited[x][y] = 1;
        if(field[x - 1][y] == 1 && visited[x - 1][y] != 1){
            findSameBug(field, visited, x - 1, y);
        }
        if(field[x][y - 1] == 1 && visited[x][y - 1] != 1){
            findSameBug(field, visited, x, y - 1);
        }
        if(field[x + 1][y] == 1 && visited[x + 1][y] != 1){
            findSameBug(field, visited, x + 1, y);
        }
        if(field[x][y + 1] == 1 && visited[x][y + 1] != 1){
            findSameBug(field, visited, x, y + 1);
        }
    }
}