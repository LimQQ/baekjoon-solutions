import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        while(n-- != 0){
            int t = Integer.parseInt(br.readLine());
            if(t == 0 && !maxHeap.isEmpty()){
                System.out.println(maxHeap.poll());
            }
            else if (t == 0 && maxHeap.isEmpty()) {
                System.out.println(0);
            }
            else{
                maxHeap.offer(t);
            }
        }
    }
}