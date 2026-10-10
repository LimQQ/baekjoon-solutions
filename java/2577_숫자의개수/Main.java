import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        t *= Integer.parseInt(br.readLine());
        t *= Integer.parseInt(br.readLine());
        String[] str = Integer.toString(t).split("");
        int[] cnt = new int[10];
        Arrays.fill(cnt, 0);
        for(int i = 0; i < str.length; i++){
            cnt[Integer.parseInt(str[i])]++;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(cnt[i]);
        }
    }
}