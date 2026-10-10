import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            int a = 0, b = 1, c = 1;
            for(int k = 0; k < t - 1; k++){
                c = a + b;
                a = b;
                b = c;
            }
            if(t == 0){
                System.out.println("1 0");
            }
            else{
                System.out.println(a + " " + b);
            }
        }
    }
}