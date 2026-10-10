import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split("-");
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i < strings.length; i++){
            String[] temp = strings[i].split("\\+");
            int sum = 0;
            for(int k = 0; k < temp.length; k++){
                sum += Integer.parseInt(temp[k]);
            }
            num.add(sum);
        }

        int result = num.get(0);
        for(int i = 1; i < num.size(); i++){
            result -= num.get(i);
        }

        System.out.println(result);
    }
}