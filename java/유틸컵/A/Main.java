import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numList = br.readLine().split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            int t = Integer.parseInt(numList[i]);
            if(t < 250){
                result.append("4 ");
            }
            else if(t < 275){
                result.append("3 ");
            }
            else if(t < 300){
                result.append("2 ");
            }
            else{
                result.append("1 ");
            }
        }

        System.out.println(result);
    }
}