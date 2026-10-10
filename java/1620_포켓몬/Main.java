import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");

        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> dogam = new ArrayList<>();

        for(int i = 0; i < Integer.parseInt(NM[0]); i++){
            String temp = br.readLine();
            map.put(temp, i + 1);
            dogam.add(temp);
        }

        for(int i = 0; i < Integer.parseInt(NM[1]); i++){
            String temp = br.readLine();
            if(temp.charAt(0) >= 'A'){
                System.out.println(map.get(temp));
            }
            else{
                System.out.println(dogam.get(Integer.parseInt(temp) - 1));
            }
        }
    }
}