import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] k = br.readLine().split(" ");
        int result = 1;
        int n = Integer.parseInt(k[0]), m = Integer.parseInt(k[1]);

        for(int i = n; i > n - m; i--){
            result *= i;
        }

        for(int i = m; i > 0; i--){
            result /= i;
        }

        System.out.println(result);
    }
}