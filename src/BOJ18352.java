
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ18352 {
    static int n, m, k, x;
    static StringBuilder result = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        List<Integer>[] road = new List[n + 1]; 
        for (int i = 1; i <= n; i++) {
            road[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            road[from].add(to);
        }

        findCity(road, x);

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void findCity(List<Integer>[] road, int startCity){
        int[] visited = new int[n+1];
        Arrays.fill(visited, -1);
        visited[startCity] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(startCity);

        while(!queue.isEmpty()){
            int city = queue.poll();
            int current = visited[city];

            for(int nextCity : road[city]){
                if(visited[nextCity] == -1){
                    visited[nextCity] = current + 1;
                    queue.offer(nextCity);
                }
            }
        }

        boolean found = false;
        for(int i=1; i<=n; i++){
            if(visited[i] == k) {
                result.append(i).append("\n");
                found = true;
            }
        }

        if(!found){
            result.append(-1).append("\n");
        }
    }
}