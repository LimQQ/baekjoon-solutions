import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(n-- != 0){
            String str = br.readLine();
            Stack<Character> stack = new Stack<Character>();
            for(int i = 0; i < str.length(); i++){
                char t = str.charAt(i);
                if(t == '('){
                    stack.push(t);
                }
                else if(stack.isEmpty()){
                    stack.push(t);
                }
                else if(stack.peek() == '('){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}