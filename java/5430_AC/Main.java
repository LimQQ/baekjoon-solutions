import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String delimiters = "[,]";
        int n = Integer.parseInt(br.readLine());
        while(n-- != 0){
            String func = br.readLine();
            int len = Integer.parseInt(br.readLine());
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), delimiters);
            boolean error = false, reverse = false;
            Deque<Integer> arr = new LinkedList<>();
            StringBuilder result = new StringBuilder();

            for(int i = 0; i < len; i++){
                arr.add(Integer.valueOf(tokenizer.nextToken()));
            }

            for(int i = 0; i < func.length(); i++){
                if(func.charAt(i) == 'R'){
                    reverse = !reverse;
                }
                else if(func.charAt(i) == 'D' && !arr.isEmpty()){
                    if(reverse){
                        arr.pollLast();
                    }
                    else{
                        arr.pollFirst();
                    }
                }
                else{
                    System.out.println("error");
                    error = true;
                    break;
                }
            }

            len = arr.size();
            if(!error && !arr.isEmpty() && !reverse){
                result.append("[" + arr.pollFirst());
                for(int i = 1; i < len; i++){
                    result.append("," + arr.pollFirst());
                }
                result.append("]");
                System.out.println(result);
            }
            else if(!error && !arr.isEmpty() && reverse) {
                result.append("[" + arr.pollLast());
                for (int i = 1; i < len; i++) {
                    result.append("," + arr.pollLast());
                }
                result.append("]");
                System.out.println(result);
            }
            else if(!error && arr.isEmpty()){
                System.out.println("[]");
            }
        }
    }
}