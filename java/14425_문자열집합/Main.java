import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(NM[0]); i++){
            list.add(br.readLine());
        }
        Collections.sort(list);

        int cnt = 0;
        for(int i = 0; i < Integer.parseInt(NM[1]); i++){
            String temp = br.readLine();
            if(Collections.binarySearch(list, temp) > -1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
};