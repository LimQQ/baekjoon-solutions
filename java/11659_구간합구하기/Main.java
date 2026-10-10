import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        ArrayList<Integer> num = new ArrayList<>();
        String[] number = br.readLine().split(" ");

        int sum = 0;
        for(int i = 0; i < Integer.parseInt(NM[0]); i++){
            sum += Integer.parseInt(number[i]);
            num.add(sum);
        }

        for(int k = 0; k < Integer.parseInt(NM[1]); k++){
            String[] ft = br.readLine().split(" ");
            int from = Integer.parseInt(ft[0]) - 2, to = Integer.parseInt(ft[1]) - 1;
            if(from == -1){
                System.out.println(num.get(to));
            }
            else {
                System.out.println(num.get(to) - num.get(from));
            }
        }
    }
}