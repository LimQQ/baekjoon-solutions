import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), cnt;
        Queue<Integer> queue = new LinkedList<>();
        while(n-- != 0) {
            queue.add(Integer.parseInt(br.readLine()));
            cnt = 0;
            while (!queue.isEmpty()) {
                int temp = queue.poll();
                if (temp > 2) {
                    queue.add(temp - 3);
                }
                if (temp > 1) {
                    queue.add(temp - 2);
                }
                if (temp > 0) {
                    queue.add(temp - 1);
                }
                if (temp == 0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}