import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] visited = new int[n + 2][n + 2], field = new int[n + 2][n + 2];
        String[] temp = new String[n + 1];
        for (int i = 0; i < n + 2; i++) {
            if (i != 0 && i != n + 1) {
                temp = br.readLine().split("");
            }
            for (int j = 0; j < n + 2; j++) {
                if (i == 0 || i == n + 1 || j == 0 || j == n + 1) {
                    visited[i][j] = 1;
                    field[i][j] = 0;
                } else {
                    field[i][j] = Integer.parseInt(temp[j - 1]);
                    visited[i][j] = 0;
                }
            }
        }

        int cnt = 0;
        ArrayList<Integer> sizeList = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (field[i][j] == 1 && visited[i][j] != 1) {
                    size = 0;
                    findSameBuild(field, visited, i, j);
                    cnt++;
                    sizeList.add(size);
                }
            }
        }
        Collections.sort(sizeList);
        result.append(cnt).append("\n");
        for (int i = 0; i < sizeList.size(); i++) {
            result.append(sizeList.get(i)).append("\n");
        }
        System.out.println(result);
    }
    public static int size;
    public static void findSameBuild(int[][] field, int[][] visited, int x, int y){
        visited[x][y] = 1;
        size++;
        if(field[x - 1][y] == 1 && visited[x - 1][y] != 1){
            findSameBuild(field, visited, x - 1, y);
        }
        if(field[x][y - 1] == 1 && visited[x][y - 1] != 1){
            findSameBuild(field, visited, x, y - 1);
        }
        if(field[x + 1][y] == 1 && visited[x + 1][y] != 1){
            findSameBuild(field, visited, x + 1, y);
        }
        if(field[x][y + 1] == 1 && visited[x][y + 1] != 1){
            findSameBuild(field, visited, x, y + 1);
        }
    }
}