import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NM = br.readLine().split(" ");
        int n = Integer.parseInt(NM[0]), m = Integer.parseInt(NM[1]);

        int[][] graph = new int[n + 1][n + 1];

        while(m-- != 0) {
            String[] temp = br.readLine().split(" ");
            int i = Integer.parseInt(temp[0]), j = Integer.parseInt(temp[1]);
            graph[i][j] = 1;
            graph[j][i] = 1;
        }

        int[] KBDArray = new int[n + 1];
        for(int i = 1; i <= n; i++){
            KBDArray[i] = findKBD(graph, n, i);
        }

        int min = KBDArray[1], mindix = 1;
        for(int i = 2; i <= n; i++){
            if(KBDArray[i] < min){
                min = KBDArray[i];
                mindix = i;
            }
        }
        System.out.println(mindix);
    }

    public static int findKBD(int[][] graph, int n, int target){
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> tempQueue = new LinkedList<>();
        int[] visited = new int[n + 1]; int KBD = 0, discnt = 0;
        queue.add(target); visited[target] = 1;
        while(!queue.isEmpty()){
            discnt++;
            while(!queue.isEmpty()) {
                int t = queue.poll();
                for (int i = 1; i <= n; i++) {
                    if (graph[t][i] == 1 && visited[i] == 0) {
                        visited[i] = 1;
                        KBD += discnt;
                        tempQueue.add(i);
                    }
                }
            }
            while(!tempQueue.isEmpty()){
                queue.add(tempQueue.poll());
            }
        }
        return KBD;
    }
}