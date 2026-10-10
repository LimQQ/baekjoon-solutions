import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            if(temp[0].equals("push")){
                int t = Integer.parseInt(temp[1]);
                stack.push(t);
            }
            else if(temp[0].equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(temp[0].equals("size")){
                System.out.println(stack.size());
            }
            else if(temp[0].equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else if(temp[0].equals("top")){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else{
                    System.out.println(stack.peek());
                }
            }
        }
    }
}