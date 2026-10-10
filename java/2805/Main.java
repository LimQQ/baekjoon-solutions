import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        int[] trees = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        long left = 0;
        long right = 1000000000;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long total = 0;

            for (int tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }

            if (total >= m) {
                answer = Math.max(answer, mid);
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
