import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);
        int[] num = new int[m + 1];
        for(int i = 1; i <= m; i++){
            num[i] = i;
        }

        int[] end = new int[m + 1];
        int last = n;
        end[0] = 0;
        for(int i = m; i > 0; i--){
            end[i] = last--;
        }
        StringBuilder result = new StringBuilder();

        while(!Arrays.equals(num, end)){
            for(int i = 1; i < m; i++){
                result.append(num[i]).append(" ");
            }
            result.append("\n");

            num[m]++;

            for(int i = m; i > 0; i--){
                if (num[i] == n){
                    num[i - 1]++;
                    num[i] = num[i - 1] + 1;
                }
            }
        }
        System.out.println(result);
    }
}