import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] point = new int[n + 1];
        for(int i = 1; i <= n; i++){
            point[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[n + 1];
        result[1] = point[1];
        if(n > 1){
            result[2] = point[1] + point[2];
        }
        if(n > 2){
            result[3] = Math.max(point[1], point[2]) + point[3];
        }
        for(int i = 4; i <= n; i++){
            result[i] = Math.max(result[i - 3] + point[i - 1], result[i - 2]) + point[i];
        }

        System.out.println(result[n]);
    }
}