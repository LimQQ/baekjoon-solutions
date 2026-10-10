import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NMV = br.readLine().split(" ");
        int n = Integer.parseInt(NMV[0]), m = Integer.parseInt(NMV[1]), v = Integer.parseInt(NMV[2]);
        int[][] graph = new int[n + 1][n + 1];
        int[] visited = new int[n + 1];

        for(int i = 1; i <= n; i++){ // 초기화
            visited[i] = 0;
            for(int j = 1; j <= n; j++){
                graph[i][j] = 0;
            }
        }

        for(int i = 0; i < m; i++){ // 그래프 만들기
            String[] temp = br.readLine().split(" ");
            int f = Integer.parseInt(temp[0]), t = Integer.parseInt(temp[1]);
            graph[f][t] = 1;
            graph[t][f] = 1;
        }

        DFS(graph, visited, n, v);
    }

    public static void DFS(int[][] graph, int[] visited, int n, int v){
        System.out.print(v + " ");
        visited[v] = 1;
        for(int i = 1; i <= n; i++){
            if(graph[v][i] == 1 && visited[i] != 1){
                DFS(graph, visited, n, i);
            }
        }
    }
}