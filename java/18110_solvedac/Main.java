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

        for(int i = 0; i < n; i++){
            num.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        int cut = Math.round((float) (n * 15) / 100);
        Collections.sort(num);

        for(int i = cut; i < n - cut; i++){
            sum += num.get(i);
        }

        System.out.println(Math.round((float) sum / (n - 2 * cut)));
    }
}