import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n > 1) {
            for (int i = 2; i * i <= n; i++) { 
                while (n % i == 0) {
                    bw.write(i + "\n");  
                    n /= i; 
                }
            }

            if (n > 1) {
                bw.write(n + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
