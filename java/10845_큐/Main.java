import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int back = -1;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            if(temp[0].equals("push")){
                int t = Integer.parseInt(temp[1]);
                Q.add(t);
                back = t;
            }
            else if(temp[0].equals("pop")){
                if(!Q.isEmpty()){
                    System.out.println(Q.remove());
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(temp[0].equals("size")){
                System.out.println(Q.size());
            }
            else if(temp[0].equals("empty")){
                if(Q.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(temp[0].equals("front")){
                if(Q.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(Q.peek());
                }
            }
            else if(temp[0].equals("back")){
                if(Q.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(back);
                }
            }
        }
    }
}