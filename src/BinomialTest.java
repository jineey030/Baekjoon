import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BinomialTest {
    static int[][] arr = new int[11][11]; 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(cal(n, k)) + "\n");
        bw.flush();
        bw.close();
    }

    private static int cal(int n, int k) {
        for (int i = 0; i <= n; i++) {
            arr[i][0] = 1;  
            arr[i][i] = 1;  
        }

        for (int i = 2; i <= n; i++) {  
            for (int j = 1; j < i; j++) { 
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        return arr[n][k];
    }
}
