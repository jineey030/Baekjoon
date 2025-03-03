
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ11005 {
    public static String convertToBase(int num, int base) {
        if (num == 0) return "0"; 
        
        StringBuilder result = new StringBuilder();
        num = Math.abs(num);

        while (num > 0) {
            int remainder = num % base;
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result.append(digit);
            num /= base;
        }

        return result.reverse().toString(); 
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(convertToBase(n, b));
        bw.flush();
        bw.close();
        br.close();
    }
}
