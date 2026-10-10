import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- != 0){
            HashMap<String, Integer> hashMap = new HashMap<>();
            ArrayList<String> List = new ArrayList<>();
            int m = Integer.parseInt(br.readLine());
            while(m-- != 0){
                String[] temp = br.readLine().split(" ");
                if(hashMap.containsKey(temp[1])){
                    hashMap.put(temp[1], hashMap.get(temp[1]) + 1);
                }
                else{
                    hashMap.put(temp[1], 1);
                    List.add(temp[1]);
                }
            }

            int result = 1;
            for(int i = 0; i < List.size(); i++){
                result *= hashMap.get(List.get(i)) + 1;
            }
            System.out.println(result - 1);
        }
    }
}