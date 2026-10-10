import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            arr.add(temp);
        }
        n = s.nextInt();
        Collections.sort(arr);
        for(int i = 0; i < n; i++) {
            int temp = s.nextInt();
            if(Collections.binarySearch(arr, temp) >= 0) {
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}