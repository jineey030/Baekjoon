import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n > 0) {
            if (n % 5 == 0) { 
                cnt += n / 5; 
                bw.write(String.valueOf(cnt));
                bw.flush();
                return;
            }
            if (n < 3) {
                bw.write(String.valueOf(-1));
                bw.flush();
                return;
            }
            n -= 3; 
            cnt++;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}