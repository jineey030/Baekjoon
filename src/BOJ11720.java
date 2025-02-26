import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();

        char[] arr = num.toCharArray();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i] - '0';  
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
