import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[15];
        for(int i = 1; i <= 14; i++){
            num[i] = i;
        }
        while(n-- != 0){
            int k = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
            System.out.println(getResidents(k, m));
        }
    }

    public static int getResidents(int k, int n) {
        if (k == 0) return n;
        if (n == 1) return 1;

        return getResidents(k, n - 1) + getResidents(k - 1, n);
    }
}