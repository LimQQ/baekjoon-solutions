import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        int[][] graph = new int[n][n];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(findRoot(graph, n, i, j)){
                    result.append(1).append(" ");
                }
                else{
                    result.append(0).append(" ");
                }
            }
            result.append("\n");
        }
        System.out.println(result);
    }

    public static boolean findRoot(int[][] graph, int n, int i, int j){
        int[] visited = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        while(!queue.isEmpty()){
            int t = queue.poll();
            if(t == j && visited[t] == 1){
                return true;
            }
            for(int k = 0; k < n; k++){
                if(graph[t][k] == 1 && visited[k] == 0){
                    queue.add(k);
                    visited[k] = 1;
                }
            }
        }
        return false;
    }
}