import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr.add(s.nextInt());
        }

        n = s.nextInt();
        Collections.sort(arr);

        for(int i = 0; i < n; i++){
            int t = s.nextInt();
            if(arr.contains(t)){
                System.out.println(arr.);
                Collections.binarySearch(arr, t);
            }
        }
    }
}