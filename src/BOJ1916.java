import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ1916 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st;
        ArrayList<ArrayList<nodes>> graph = new ArrayList<>();

        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            graph.get(s).add(new nodes(e, value));
        }

        st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int result = search(s, e, graph, n);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    static class nodes implements Comparable<nodes> {
        int node, value;

        public nodes(int node, int value) {
            this.node = node;
            this.value = value;
        }

        @Override
        public int compareTo(nodes o) {
            return this.value - o.value;
        }
    }

    static int search(int start, int end, ArrayList<ArrayList<nodes>> graph, int size) {
        PriorityQueue<nodes> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[size+1];

        pq.add(new nodes(start, 0));

        while(!pq.isEmpty()){
            nodes city = pq.poll();
            
            if(city.node == end){
                return city.value;
            }

            visited[city.node] = true;

            for(nodes nextCity : graph.get(city.node)) {
                if(!visited[nextCity.node]){
                    pq.add(new nodes(nextCity.node, city.value+nextCity.value));
                }
            }
        }

        return -1;
    }
}