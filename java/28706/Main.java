import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- != 0){
            int m = Integer.parseInt(br.readLine());
            int[] num = new int[7];
            for(int j = 0; j < 7; j++){
                num[j] = 0;
            }
            num[1] = 1;
            while(m-- != 0){
                String[] choice = br.readLine().split(" ");
                String op1 = choice[0], op2 = choice[2];
                int a = Integer.parseInt(choice[1]), b = Integer.parseInt(choice[3]);
                int[] temp = new int[7];
                for(int j = 0; j < 7; j++){
                    temp[j] = 0;
                }
                for(int i = 0; i < 7; i++){
                    if(num[i] == 1){
                        num[i] = 0;
                        if(Objects.equals(op1, "+")){
                            temp[(i + a) % 7] = 1;
                        }
                        else{
                            temp[(i * a) % 7] = 1;
                        }
                        if(Objects.equals(op2, "+")){
                            temp[(i + b) % 7] = 1;
                        }
                        else{
                            temp[(i * b) % 7] = 1;
                        }
                    }
                }
                num = temp;
            }

            if(num[0] == 1){
                System.out.println("LUCKY");
            }
            else{
                System.out.println("UNLUCKY");
            }
        }
    }
}