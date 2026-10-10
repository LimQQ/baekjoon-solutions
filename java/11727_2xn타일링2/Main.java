import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[1001];
        num[1] = 1; num[2] = 3;
        for(int i = 3; i <= n; i++){
            num[i] = (num[i - 1] + num[i - 2] + num[i - 2]) % 10007;
        }
        System.out.println(num[n]);
    }
}