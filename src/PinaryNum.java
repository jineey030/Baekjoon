
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PinaryNum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] result = new long[n+1];

        result[0] = 0;
        result[1] = 1;

        for(int i=2; i<=n; i++){
            result[i] = result[i-1]+result[i-2];
        }

        bw.write(result[n]+"\n");
        bw.flush();
        bw.close();
    }
}