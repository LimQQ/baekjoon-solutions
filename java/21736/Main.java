import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        StringTokenizer st = new StringTokenizer("");
        int m = Integer.parseInt(MN[0]), n = Integer.parseInt(MN[1]);
        int startX = 0, startY = 0;
        int[][] visited = new int[m + 2][n + 2];
        char[][] campus = new char[m + 2][n + 2];
        String[] save = new String[m];
        for(int i = 0; i < m; i++){
            save[i] = br.readLine();
        }

        for(int i = 0; i < m + 2; i++){
            for(int j = 0; j < n + 2; j++){
                if(i == 0 || i == m + 1 || j == 0 || j == n + 1){
                    visited[i][j] = 1;
                    campus[i][j] = 'X';
                }
                else{
                    visited[i][j] = 0;
                    campus[i][j] = save[i - 1].charAt(j - 1);
                    if(campus[i][j] == 'I'){
                        startX = i;
                        startY = j;
                    }
                }
            }
        }

        findPerson(campus, visited, startX, startY);

        if(cnt == 0){
            System.out.println("TT");
        }
        else{
            System.out.println(cnt);
        }
    }

    public static void findPerson(char[][] campus, int[][] visited, int x, int y){
        visited[x][y] = 1;
        if(campus[x][y] == 'P'){
            cnt++;
        }
        if(campus[x - 1][y] != 'X' && visited[x - 1][y] != 1){
            findPerson(campus, visited, x - 1, y);
        }
        if(campus[x][y - 1] != 'X' && visited[x][y - 1] != 1){
            findPerson(campus, visited, x, y - 1);
        }
        if(campus[x + 1][y] != 'X' && visited[x + 1][y] != 1){
            findPerson(campus, visited, x + 1, y);
        }
        if(campus[x][y + 1] != 'X' && visited[x][y + 1] != 1){
            findPerson(campus, visited, x, y + 1);
        }
    }
}