import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = "1";
        while(!temp.equals("0")){
            temp = br.readLine();
            if(!temp.equals("0") && ispelin(temp)){
                System.out.println("yes");
            }
            else if(!temp.equals("0")){
                System.out.println("no");
            }
        }
    }
    static boolean ispelin(String temp){
        int left = 0, right = temp.length() - 1;
        while(left < right){
            if(temp.charAt(left) != temp.charAt(right)){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}