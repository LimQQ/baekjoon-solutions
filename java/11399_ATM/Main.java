import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> num = new ArrayList<>();
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            num.add(Integer.parseInt(arr[i]));
        }

        Collections.sort(num);

        int sum = 0;
        for(int i = n; i > 0; i--){
            sum += i * num.get(n - i);
        }
        System.out.println(sum);
    }
}