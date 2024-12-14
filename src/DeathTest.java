import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DeathTest {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        bw.write(String.valueOf(sb.append(check(arr, k))));
        bw.flush();
        bw.close();
    }

    private static int check(int[] arr, int k) {
        int n = arr.length;
        
        for (int m = 1; m <= n; m++) {
            int current = 0; 

            for (int i = 1; i <= m; i++) {
                current = arr[current]; 
                if (current == k) {
                    return m;  
                }
            }
        }

        return -1; 
    }
}
