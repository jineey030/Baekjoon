import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long lcm = (a * b) / gcd(a, b);

        bw.write(String.valueOf(lcm));
        bw.flush();
    }

    public static long gcd(long a, long b){
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        return (long) a;
    }
}