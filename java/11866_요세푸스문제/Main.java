import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();

        for(int i = 1; i <= n; i++){
            arr.add(i);
        }

        int idx = -1;

        System.out.printf("<");

        while(arr.size() != 1){
            idx += m;
            idx = idx % arr.size();
            System.out.printf("%d, ", arr.remove(idx));
            idx--;
        }

        System.out.printf("%d>", arr.remove(0));
    }
}