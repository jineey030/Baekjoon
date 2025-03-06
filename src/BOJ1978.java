import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int cnt = 0;

        for (String s : arr) {
            int num = Integer.parseInt(s);
            if (isPrime(num)) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false; 

        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) return false;
        }

        return true;
    }
}
