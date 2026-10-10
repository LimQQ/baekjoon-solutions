import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        long n = Long.parseLong(NM[0]), m = Long.parseLong(NM[1]);

        Queue<num> queue = new LinkedList<>();
        queue.add(new num(n, 1)); boolean yesNum = false;

        while(!queue.isEmpty()){
            num t = queue.poll();

            if(t.n * 2 == m || t.n * 10 + 1 == m){
                System.out.println(t.cnt + 1);
                yesNum = true;
                break;
            }

            if(t.n * 2 < m){
                queue.add(new num(t.n * 2, t.cnt + 1));
            }
            if(t.n * 10 + 1 < m){
                queue.add(new num(t.n * 10 + 1, t.cnt + 1));
            }
        }

        if(!yesNum){
            System.out.println(-1);
        }
    }

    public static class num{
        long n;
        int cnt;
        public num(long n, int cnt){
            this.n = n;
            this.cnt = cnt;
        }
    }
}