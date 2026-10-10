import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] visited1 = new int[n + 2][n + 2];
        int[][] visited2 = new int[n + 2][n + 2];
        String[][] field1 = new String[n + 2][n + 2];
        String[][] field2 = new String[n + 2][n + 2];
        String[] temp = new String[n + 1];
        for (int i = 0; i < n + 2; i++) {
            if (i != 0 && i != n + 1) {
                temp = br.readLine().split("");
            }
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || i == n + 1 || j == 0 || j == n + 1) {
                    visited1[i][j] = 1;
                    visited2[i][j] = 1;
                    field1[i][j] = "W";
                    field2[i][j] = "W";
                } else {
                    field1[i][j] = temp[j - 1];
                    if(Objects.equals(temp[j - 1], "G")){
                        field2[i][j] = "R";
                    }
                    else{
                        field2[i][j] = temp[j - 1];
                    }
                    visited1[i][j] = 0;
                    visited2[i][j] = 0;
                }
            }
        }

        int cnt1 = 0, cnt2 = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(visited1[i][j] != 1) {
                    String target = field1[i][j];
                    findNormalColor(field1, visited1, i, j, target);
                    cnt1++;
                }
                if(visited2[i][j] != 1) {
                    String target = field2[i][j];
                    findAbnormalColor(field2, visited2, i, j, target);
                    cnt2++;
                }
            }
        }
        System.out.printf("%d %d", cnt1, cnt2);
    }
    public static void findNormalColor(String[][] field, int[][] visited, int x, int y, String target){
        visited[x][y] = 1;
        if(Objects.equals(field[x - 1][y], target) && visited[x - 1][y] != 1){
            findNormalColor(field, visited, x - 1, y, target);
        }
        if(Objects.equals(field[x][y - 1], target) && visited[x][y - 1] != 1){
            findNormalColor(field, visited, x, y - 1, target);
        }
        if(Objects.equals(field[x + 1][y], target) && visited[x + 1][y] != 1){
            findNormalColor(field, visited, x + 1, y, target);
        }
        if(Objects.equals(field[x][y + 1], target) && visited[x][y + 1] != 1){
            findNormalColor(field, visited, x, y + 1, target);
        }
    }

    public static void findAbnormalColor(String[][] field, int[][] visited, int x, int y, String target){
        visited[x][y] = 1;
        if(Objects.equals(field[x - 1][y], target) && visited[x - 1][y] != 1){
            findNormalColor(field, visited, x - 1, y, target);
        }
        if(Objects.equals(field[x][y - 1], target) && visited[x][y - 1] != 1){
            findNormalColor(field, visited, x, y - 1, target);
        }
        if(Objects.equals(field[x + 1][y], target) && visited[x + 1][y] != 1){
            findNormalColor(field, visited, x + 1, y, target);
        }
        if(Objects.equals(field[x][y + 1], target) && visited[x][y + 1] != 1){
            findNormalColor(field, visited, x, y + 1, target);
        }
    }
}