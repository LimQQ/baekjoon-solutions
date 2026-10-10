import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n+1];
        num[0] = 0;
        for(int i = 1; i <= n; i++){
            int t = 1;
            num[i] = 100;
            while(i - t * t >= 0){
                num[i] = Math.min(num[i - t * t], num[i]);
                t++;
            }
            num[i]++;
        }
        System.out.println(num[n]);
    }
}