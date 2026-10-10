import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            result.append(findYear(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
        }
        System.out.println(result);
    }
    public static int findYear(int M, int N, int x, int y) {
        int maxYear = lcm(M, N);
        while (x <= maxYear) {
            if ((x - y) % N == 0) {
                return x;
            }
            x += M;
        }
        return -1;
    }
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}