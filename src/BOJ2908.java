import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] irr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            irr[i] = Integer.parseInt(sb.reverse().toString());
        }

        if (irr[0] > irr[1]) {
            bw.write(String.valueOf(irr[0]));
        } else {
            bw.write(String.valueOf(irr[1]));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
