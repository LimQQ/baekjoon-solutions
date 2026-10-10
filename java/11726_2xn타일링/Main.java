import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 1, b = 2, c = 3;
        while (n-- != 2) {
            c = a + b;
            a = b;
            b = c % 10007;
        }
        System.out.println(b);
    }
}