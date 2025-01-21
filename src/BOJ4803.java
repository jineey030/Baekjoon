import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ4803 {
    static int n, m, edgeCnt, caseCnt = 0, pointCnt;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            if(n == 0 && m == 0){
                break;
            }

            visited = new boolean[n+1];
            graph = new ArrayList[n+1];

            for(int i=1; i<=n; i++){
                graph[i] = new ArrayList<>();
            }

            for(int i=1; i<=m; i++){
                st = new StringTokenizer(br.readLine());
                
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                graph[x].add(y);
                graph[y].add(x);
            }

            check();
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void check() {
        caseCnt++;

        int treeCnt = 0;

        for(int i=1; i<=n; i++){
            if(visited[i]) {
                continue;
            }

            pointCnt = 0;
            edgeCnt = 0;

            dfs(i);

            if(edgeCnt == (pointCnt-1) * 2) {
                treeCnt++;
            }
        }

        sb.append("Case ").append(caseCnt).append(": ");

        if(treeCnt ==0){
            sb.append("No trees.");
        } else if(treeCnt == 1) {
            sb.append("There is one tree.");
        } else {
            sb.append("A forest of ").append(treeCnt).append(" trees.");
        }
        sb.append('\n');
    }

    static void dfs(int x){
        pointCnt++;
        edgeCnt += graph[x].size();
        visited[x] = true;

        for(int y : graph[x]){
            if(visited[y]){
                continue;
            }

            dfs(y);
        }
    }
}