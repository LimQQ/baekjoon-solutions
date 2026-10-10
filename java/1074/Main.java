import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NRC = br.readLine().split(" ");
        int n = Integer.parseInt(NRC[0]), r = Integer.parseInt(NRC[1]), c = Integer.parseInt(NRC[2]);
        int from = 0, to = (int) (Math.pow(2, n) * Math.pow(2, n));
        coord start = new coord(0, 0), end = new coord((int) Math.pow(2, n), (int) Math.pow(2, n));

        while(from < to){
            int sai = n / 2;
            if(row > )
        }
    }

    public static class coord{
        int x;
        int y;
        public coord(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}