import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        while(n-- != 0){
            String[] temp = br.readLine().split(" ");
            Queue<stringSet> queue = new LinkedList<>();
            queue.add(new stringSet(Integer.parseInt(temp[0])));

            for(int i = 0; i < 10001; i++){
                visited[i] = 0;
            }

            while(!queue.isEmpty()){
                stringSet t = queue.poll();
                if(t.num == Integer.parseInt(temp[1])){
                    result.append(t.action).append("\n");
                    break;
                }

                if(visited[t.num] != 1){
                    visited[t.num] = 1;
                    queue.add(D(t));
                    queue.add(S(t));
                    queue.add(L(t));
                    queue.add(R(t));
                }
            }
        }
        System.out.println(result);
    }

    public static int[] visited = new int[10001];

    public static stringSet D(stringSet sSet){
        stringSet temp = new stringSet(0);
        temp.num = (sSet.num * 2) % 10000;
        temp.action = sSet.action + "D";
        return temp;
    }

    public static stringSet S(stringSet sSet){
        stringSet temp = new stringSet(0);
        if(sSet.num == 0){
            temp.num = 9999;
        }
        else{
            temp.num = sSet.num - 1;
        }
        temp.action = sSet.action + "S";
        return temp;
    }
    public static stringSet L(stringSet sSet){
        stringSet temp = new stringSet(0);
        temp.num = sSet.num % 1000 * 10 + sSet.num / 1000;
        temp.action = sSet.action + "L";
        return temp;
    }
    public static stringSet R(stringSet sSet){
        stringSet temp = new stringSet(0);
        temp.num = sSet.num % 10 * 1000 + sSet.num / 10;
        temp.action = sSet.action + "R";
        return temp;
    }
    public static class stringSet{
        int num;
        String action = "";
        public stringSet(int num){
            this.num = num;
        }
    }
}