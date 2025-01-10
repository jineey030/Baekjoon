
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ19941 {
    static int result = 0;
    static char[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = br.readLine().toCharArray();
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(arr[i] == 'P'){
                for(int j=-k; j<=k; j++){
                    if(i+j >= n) break;
                    if(i+j < 0) continue;

                    if(arr[i+j] == 'H' && visited[i+j] == false){
                        visited[i+j] = true;
                        result += 1;
                        break;
                    }
                }
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
  