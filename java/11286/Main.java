import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        HashMap<Integer, sign> hashMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        while(n-- != 0){
            int t = Integer.parseInt(br.readLine());
            if(t == 0){
                if(!priorityQueue.isEmpty()){
                    int k = priorityQueue.poll();
                    sign tSign = hashMap.get(k);
                    if(tSign.minus > 0){
                        result.append(-k).append("\n");
                        tSign.minus--;
                        hashMap.put(k, tSign);
                    }
                    else if(tSign.plus > 0){
                        result.append(k).append("\n");
                        tSign.plus--;
                        hashMap.put(k, tSign);
                    }
                }
                else{
                    result.append(0).append("\n");
                }
            }
            else{
                if(t > 0){
                    priorityQueue.offer(t);
                    if(hashMap.containsKey(t)){
                        hashMap.put(t, new sign(hashMap.get(t).plus + 1, hashMap.get(t).minus));
                    }
                    else{
                        hashMap.put(t, new sign(1, 0));
                    }
                }
                else{
                    priorityQueue.offer(-t);
                    if(hashMap.containsKey(-t)){
                        hashMap.put(-t, new sign(hashMap.get(-t).plus, hashMap.get(-t).minus + 1));
                    }
                    else{
                        hashMap.put(-t, new sign(0, 1));
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static class sign{
        int plus;
        int minus;
        public sign(int plus, int minus){
            this.plus = plus;
            this.minus = minus;
        }
    }
}