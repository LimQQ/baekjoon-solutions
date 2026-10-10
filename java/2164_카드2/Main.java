import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 2; i <= n; i += 2){
            Q.add(i);
        }
        if(n == 1){
            System.out.println(1);
        }
        else{
            if(n%2 == 1){
                Q.remove();
                Q.add(2);
            }
            while(Q.size() != 1){
                Q.remove();
                int temp = Q.remove();
                Q.add(temp);
            }
            System.out.println(Q.remove());
        }
    }
}
