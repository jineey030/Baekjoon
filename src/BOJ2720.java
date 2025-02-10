
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2720 {
    static int quarter = 25, dime = 10, nickel = 5, penny = 1;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = Integer.parseInt(br.readLine());
        int[] coins = new int[c];

        for(int i=0; i<c; i++){
            coins[i] = Integer.parseInt(br.readLine());
            check(coins[i]);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void check(int coin) {
        int remainder = 0;

        sb.append(coin/quarter).append(" ");
        remainder = coin % quarter;

        sb.append(remainder/dime).append(" ");
        remainder = remainder % dime;

        sb.append(remainder/nickel).append(" ");
        remainder = remainder % nickel;

        sb.append(remainder/penny).append(" ");
        remainder = remainder % penny;

        sb.append('\n');
    }
}
