import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] set = new int[21];
        for(int i = 0; i < 21; i++){
            set[i] = 0;
        }
        for(int i = 0; i < n; i++){
            String[] temp = br.readLine().split(" ");
            if(temp[0].equals("add")){
                int t = Integer.parseInt(temp[1]);
                set[t] = 1;
            }
            else if(temp[0].equals("remove")){
                int t = Integer.parseInt(temp[1]);
                if(set[t] == 1){
                    set[t] = 0;
                }
            }
            else if(temp[0].equals("check")){
                int t = Integer.parseInt(temp[1]);
                if(set[t] == 1){
                    sb.append("1\n");
                }
                else{
                    sb.append("0\n");
                }
            }
            else if(temp[0].equals("toggle")){
                int t = Integer.parseInt(temp[1]);
                if(set[t] == 1){
                    set[t] = 0;
                }
                else{
                    set[t] = 1;
                }
            }
            else if(temp[0].equals("all")){
                for(int k = 1; k < 21; k++){
                    set[k] = 1;
                }
            }
            else if(temp[0].equals("empty")){
                for(int k = 0; k < 21; k++){
                    set[k] = 0;
                }
            }
            if(sb.length() == 1001){
                System.out.println(sb);
                sb.delete(0, 1000);
            }
        }
        System.out.println(sb);
    }
}