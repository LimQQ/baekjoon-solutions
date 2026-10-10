import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n + 1];

        num[1] = 0;

        for(int i = 2; i <= n; i++){
            if(i % 6 == 0){
                num[i] = Math.min(Math.min(num[i/3], num[i/2]), Math.min(num[i/2], num[i-1])) + 1;
            }
            else if(i % 3 == 0){
                num[i] = Math.min(num[i/3], num[i-1]) + 1;
            }
            else if(i % 2 == 0){
                num[i] = Math.min(num[i/2], num[i-1]) + 1;
            }
            else{
                num[i] = num[i-1] + 1;
            }
        }

        System.out.println(num[n]);
    }
}