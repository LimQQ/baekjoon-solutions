import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            if(temp[0].equals("push_front")){
                int t = Integer.parseInt(temp[1]);
                dq.addFirst(t);
            }
            else if(temp[0].equals("push_back")){
                int t = Integer.parseInt(temp[1]);
                dq.addLast(t);
            }
            else if(temp[0].equals("pop_front")){
                if(!dq.isEmpty()){
                    System.out.println(dq.removeFirst());
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(temp[0].equals("pop_back")){
                if(!dq.isEmpty()){
                    System.out.println(dq.removeLast());
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(temp[0].equals("size")){
                System.out.println(dq.size());
            }
            else if(temp[0].equals("empty")){
                if(dq.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(temp[0].equals("front")){
                if(dq.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(dq.peekFirst());
                }
            }
            else if(temp[0].equals("back")){
                if(dq.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(dq.peekLast());
                }
            }
        }
    }
}