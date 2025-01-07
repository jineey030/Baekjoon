import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SubsequenceTest {
    static int n, s;
    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        bw.write((s == 0 ? cnt - 1 : cnt) + "\n");
        bw.flush();
        bw.close();
    }

    public static void dfs(int idx, int sum){
        if(idx == n){
            if(sum == s){
                cnt++;
            }
            return;
        }

        dfs(idx + 1, sum + arr[idx]); //원소 선택 시
        dfs(idx + 1, sum); //원소 미선택 시
    }
}
