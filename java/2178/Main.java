import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] MN = br.readLine().split(" ");
        int m = Integer.parseInt(MN[0]), n = Integer.parseInt(MN[1]);
        String[] temp = new String[n + 2];
        int startX = 0, startY = 0;
        int[][] distancedMap = new int[m + 2][n + 2];
        int[][] map = new int[m + 2][n + 2];

        for(int i = 0; i < m + 2; i++){
            if(i != 0 && i != m + 1){
                temp = br.readLine().split("");
            }
            for(int j = 0; j < n + 2; j++){
                if(i == 0 || i == m + 1 || j == 0 || j == n + 1){
                    distancedMap[i][j] = 10000000;
                    map[i][j] = 0;
                }
                else{
                    distancedMap[i][j] = 10000000;
                    map[i][j] = Integer.parseInt(temp[j - 1]);
                }
            }
        }

        setDistance(map, distancedMap, 1, 1, 0);

        System.out.println(distancedMap[m][n] + 1);
    }

    public static void setDistance(int[][] map, int[][] distancedMap, int x, int y, int distance){
        Queue<XY> queue = new LinkedList<>();
        queue.add(new XY(x, y, 0));
        while(!queue.isEmpty()) {
            XY temp = queue.poll();
            x = temp.x; y = temp.y; distance = temp.distance;
            if (map[x][y] == 1 && distancedMap[x][y] > distance + 1) {
                distancedMap[x][y] = distance;
                queue.add(new XY(x - 1, y, distance + 1));
                queue.add(new XY(x, y - 1, distance + 1));
                queue.add(new XY(x + 1, y, distance + 1));
                queue.add(new XY(x, y + 1, distance + 1));
            }
        }
    }

    public static class XY{
        int x;
        int y;
        int distance;
        public XY(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}
