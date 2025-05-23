import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class BOJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        char[] arr = num.toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            bw.write(arr[i]);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}