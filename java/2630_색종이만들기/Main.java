import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int whiteCnt = 0;
    public static int blueCnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n][n];
        for(int i = 0; i < n; i++){
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                paper[i][j] =  Integer.parseInt(tokenizer.nextToken());
            }
        }
        
        isOneColor(paper, 0, 0, n);
        
        System.out.println(whiteCnt);
        System.out.println(blueCnt);
    }

    public static boolean isOneColor(int[][] paper, int x, int y, int size){
        int def = paper[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(paper[i][j] != def){
                    isOneColor(paper, x, y, size / 2);
                    isOneColor(paper, x + size / 2, y, size / 2);
                    isOneColor(paper, x, y + size / 2, size / 2);
                    isOneColor(paper, x + size / 2, y + size / 2, size / 2);
                    return false;
                }
            }
        }
        if(def == 0){
            whiteCnt++;
        }
        else{
            blueCnt++;
        }
        return true;
    }
}