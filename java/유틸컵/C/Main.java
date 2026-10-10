import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n ;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(Collections.reverseOrder());

        int levelSum = 0, statusSum = 0;
        for(int i = 0; i < n; i++){
            if(i < 42){
                int t = list.get(i);
                levelSum += t;
                if(t >= 250){
                    statusSum += 5;
                }
                else if(t >= 200){
                    statusSum += 4;
                }
                else if(t >= 140){
                    statusSum += 3;
                }
                else if(t >= 100){
                    statusSum += 2;
                }
                else if(t >= 60){
                    statusSum += 1;
                }
            }
        }

        System.out.println(levelSum + " " + statusSum);
    }
}