import java.util.*;

public class ConnectTest {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    public static void dfs(int node) {
        visited[node] = true;  
        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor); 
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int m = sc.nextInt();  

        visited = new boolean[n + 1];  
        graph = new ArrayList[n + 1];  

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);  
            graph[v].add(u);  
        }

        int connected = 0;  

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {  
                dfs(i);  
                connected++;  
            }
        }

        System.out.println(connected);
        sc.close();  
    }
}
