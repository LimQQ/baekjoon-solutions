import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ft = br.readLine().split(" ");
        int from = Integer.parseInt(ft[0]), to = Integer.parseInt(ft[1]);
        if(from > to){
            System.out.println(from - to);
        }
        else{
            Queue<set> queue = new LinkedList<>();
            int[] visited = new int[100001];
            for(int i = 1; i < 100001; i++){
                visited[i] = 0;
            }
            queue.add(new set(from, 0));
            while(true){
                set t = queue.poll();
                visited[t.num] = 1;
                if(t.num == to){
                    System.out.println(t.cnt);
                    break;
                }
                else{
                    if(t.num - 1 > 0 && visited[t.num - 1] != 1){
                        queue.add(new set(t.num - 1, t.cnt + 1));
                    }
                    if(t.num + 1 <= 100000 && visited[t.num + 1] != 1){
                        queue.add(new set(t.num + 1, t.cnt + 1));
                    }
                    if(t.num * 2 <= 100000 && visited[t.num * 2] != 1){
                        queue.add(new set(t.num * 2, t.cnt + 1));
                    }
                }
            }
        }

    }
    public static class set{
        int num;
        int cnt = 0;

        public set(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
}