import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
        int[] list = new int[n + 1];
        for(int i = 1; i <= n; i++){
            list[i] = -1;
        }
        while(m-- != 0){
            String[] FT = br.readLine().split(" ");
            int f = Integer.parseInt(FT[0]), t = Integer.parseInt(FT[1]);
            weightedUnion(list, findRoot(list, f), findRoot(list, t));
        }

        System.out.println(-list[findRoot(list, 1)] - 1);
    }

    public static void weightedUnion(int[] list, int a, int b){
        int t = list[a] + list[b];
        if(a != b){
            if(list[a] > list[b]){
                list[a] = b;
                list[b] = t;
            }
            else{
                list[b] = a;
                list[a] = t;
            }
        }
    }

    public static int findRoot(int[] list, int k){
        while(list[k] > 0){
            k = list[k];
        }
        return k;
    }
}