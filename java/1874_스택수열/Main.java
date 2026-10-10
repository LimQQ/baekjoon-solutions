import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        ArrayList<Integer> Output = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            Output.add(Integer.parseInt(br.readLine()));
        }

        int idx = 0;
        for(int i = 1; i <= n; i++){
            stack.push(i);
            result.append("+\n");
            while(!stack.isEmpty() && stack.peek() == Output.get(idx)){
                idx++;
                stack.pop();
                result.append("-\n");
            }
        }

        if(stack.isEmpty()){
            System.out.println(result);
        }
        else{
            System.out.println("NO");
        }
    }
}