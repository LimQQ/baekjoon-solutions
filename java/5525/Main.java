import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
        String s = br.readLine() + "OO";
        int IOICnt = 0, result = 0;
        for(int i = 2; i < m; i++){
            if(s.charAt(i - 2) == 'I' && s.charAt(i - 1) == 'O' && s.charAt(i) == 'I'){
                i += 2;
                IOICnt = 1;
                if(IOICnt >= n){
                    result++;
                }
                while(s.charAt(i - 1) == 'O' && s.charAt(i) == 'I'){
                    i += 2;
                    IOICnt++;
                    if(IOICnt >= n){
                        result++;
                    }
                }
                i -= 2;
            }
        }
        System.out.println(result);
    }
}