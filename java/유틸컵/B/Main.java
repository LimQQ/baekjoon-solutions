import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] today = br.readLine().split("-");
        int n = Integer.parseInt(br.readLine()), cnt = 0;
        while(n-- != 0){
            String[] due = br.readLine().split("-");
            if(Integer.parseInt(due[0]) > Integer.parseInt(today[0])){
                cnt++;
            }
            else if(Objects.equals(due[0], today[0]) && Integer.parseInt(due[1]) > Integer.parseInt(today[1])){
                cnt++;
            }
            else if(Objects.equals(due[0], today[0]) && Objects.equals(due[1], today[1]) && Integer.parseInt(due[2]) >= Integer.parseInt(today[2])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}