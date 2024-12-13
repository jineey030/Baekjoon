import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MakeOneTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        br.close();

        bw.write(String.valueOf(makeOne(x)) + '\n');
        bw.flush();
        bw.close();
    }

    private static int makeOne(int x) {
        int[] dp = new int[x + 1];
        
        dp[1] = 0;
        
        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1] + 1;
            
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[x];
    }
}
