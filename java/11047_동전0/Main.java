import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);
        int[] coin = new int[n];

        for(int i = 0; i < n; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int coinIdx = n - 1, cnt = 0;

        while(m > 0){
            while(m - coin[coinIdx] >= 0){
                m -= coin[coinIdx];
                cnt++;
            }
            coinIdx--;
        }
        System.out.println(cnt);
    }
}