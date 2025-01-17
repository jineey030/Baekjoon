
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2116 {
    static int n;
    static int max = -1;
    static int[][] dice;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        dice = new int[n][6];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=0; j<6; j++) {
                dice[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<6; i++){
            search(1, i, 0);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void search(int cnt, int bottom, int sum){
        int pair = pairCheck(bottom);
        int maxCheck = -1;

        for(int i=0; i<6; i++){
            if(i == pair || i == bottom) {
                continue;
            }
            maxCheck = Math.max(maxCheck, dice[cnt-1][i]);
        }
        sum += maxCheck;

        if(cnt == n){
            max = Math.max(max, sum); 
            return;
        }

        for(int i=0; i<6; i++){
            if(dice[cnt-1][pair] == dice[cnt][i]){
                search(cnt+1, i, sum);
                break;
            }
        }
    }

    public static int pairCheck(int idx) {
        if(idx == 0) {
            return 5;
        } else if (idx == 1) {
            return 3;
        } else if (idx == 2) {
            return 4;
        } else if (idx == 3) {
            return 1;
        } else if (idx == 4) {
            return 2;
        } else {
            return 0;
        }
    }
}