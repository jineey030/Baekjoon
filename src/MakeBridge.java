import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MakeBridge {
    static int[][] site = new int[30][30]; 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 30; i++) {
            site[i][0] = 1; 
            site[i][i] = 1;
        }

        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < i; j++) {
                site[i][j] = site[i - 1][j - 1] + site[i - 1][j]; 
            }
        }

        int T = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < T; t++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);

            bw.write(site[m][n] + "\n");
        }

        bw.flush();
        bw.close();
    }
}
