import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = new String();
        while((str = br.readLine()) != null){
            if(str.equals(".")){
                break;
            }
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++){
                char t = str.charAt(i);
                if(t == '(' || t == '['){
                    stack.push(t);
                }
                else if(!stack.isEmpty() && stack.peek() == '(' && t == ')'){
                    stack.pop();
                }
                else if(!stack.isEmpty() && stack.peek() == '[' && t == ']'){
                    stack.pop();
                }
                else if(t == ')' || t == ']'){
                    stack.push(t);
                }
            }
            if(stack.isEmpty()){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}