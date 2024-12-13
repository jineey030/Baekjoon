
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CycleTest {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");

            sb.append(cycle(arr)).append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static int cycle(String[] arr){
        boolean[] visited = new boolean[arr.length];
        int cnt = 0;

        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                cnt++;
                int current = i;

                while(!visited[current]){
                    visited[current] = true;
                    current = Integer.parseInt(arr[current])-1;

                }
            }         
        }
        
        return cnt;
    }
}
