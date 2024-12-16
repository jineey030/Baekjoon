import java.util.*;

public class CusionTest {
    static int n, a, b, m;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        a = sc.nextInt() - 1; 
        b = sc.nextInt() - 1; 
        
        m = sc.nextInt();
        
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 0; i < m; i++) {
            int parent = sc.nextInt() - 1; 
            int child = sc.nextInt() - 1; 
            graph[parent].add(child);
            graph[child].add(parent); 
        }
        
        int result = bfs(a, b);

        System.out.println(result);
    }
    
    public static int bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[n];
        queue.add(new int[] {start, 0}); 
        visited[start] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int distance = current[1];
            
            if (node == target) {
                return distance;
            }
            
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new int[] {neighbor, distance + 1});
                }
            }
        }
        
        return -1;
    }
}
