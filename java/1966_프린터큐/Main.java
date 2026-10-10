import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class check{
        int data;
        int check = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        while(k-- != 0){
            ArrayList<Integer> arr = new ArrayList<>();
            String[] NM = br.readLine().split(" ");
            int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]), target = 0;
            String[] num = br.readLine().split(" ");
            Queue<check> Q = new LinkedList<>();
            for(int i = 0; i < n; i++){
                check temp = new check();
                arr.add(Integer.parseInt(num[i]));
                temp.data = arr.get(i);
                temp.check = 0;
                if(i == m){
                    temp.check = 1;
                }
                Q.add(temp);
            }

            Collections.sort(arr);
            Collections.reverse(arr);

            int cnt = 0;
            while(!Q.isEmpty()){
                check t = Q.remove();
                if(t.data == arr.get(0)){
                    if(t.check == 1){
                        System.out.println(cnt + 1);
                        break;
                    }
                    else{
                        arr.remove(0);
                        cnt++;
                    }
                }
                else{
                    Q.add(t);
                }
            }
        }
    }
}