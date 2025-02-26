import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = br.readLine().toCharArray();
        int i = Integer.parseInt(br.readLine());

        bw.write(arr[i-1]);
        bw.flush();
        bw.close();
        br.close();
    }
}