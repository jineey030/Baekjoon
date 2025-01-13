import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ13164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int[] gaps = new int[n-1];

        for(int i=1; i<n; i++){
            gaps[i-1] = arr[i] - arr[i-1];
        }

        Arrays.sort(gaps);

        int cost = 0;

        for(int i=0; i<n-k; i++){
            cost += gaps[i];
        }

        bw.write(String.valueOf(cost));
        bw.flush();
        bw.close();
        br.close();
    }
}