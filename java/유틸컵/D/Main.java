import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] A = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j <= n; j++){
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        while(m-- != 0){
            String[] input = br.readLine().split(" ");
            if(input[0].equals("1")){
                int t = A[Integer.parseInt(input[1])][n];
                for(int i = n - 1; i > 0; i--){
                    A[Integer.parseInt(input[1])][i + 1] = A[Integer.parseInt(input[1])][i];
                }
                A[Integer.parseInt(input[1])][1] = t;
            }
            else{
                int[][] B = new int[n + 1][n + 1];
                for(int i = 1; i <= n; i++){
                    for(int j = 1; j <= n; j++){
                        B[j][n - i + 1] = A[i][j];
                    }
                }
                A = B;
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}