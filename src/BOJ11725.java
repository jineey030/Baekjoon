
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

public class BOJ11725 {
    static int n;
    static int[] parents;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        List<Integer>[] nodes = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            nodes[i] = new ArrayList<>();
        }

        for(int i=0; i<n-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            nodes[k].add(v);
            nodes[v].add(k);
        }

        parents = new int[n+1];
        Arrays.fill(parents, -1);
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        parents[1] = 0;

        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int neighbor : nodes[node]){
                if(parents[neighbor] == -1){
                    parents[neighbor] = node;
                    queue.offer(neighbor);
                }
            }
        }

        for(int i=2; i<=n; i++){
            bw.write(parents[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
