import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            hashMap.put(temp[0], temp[1]);
        }

        for(int i = 0; i < m; i++){
            System.out.println(hashMap.get(br.readLine()));
        }
    }
}