import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] iArr = new int[26]; 
        for (int i = 0; i < 26; i++) {
            iArr[i] = -1; 
        }

        char[] cArr = br.readLine().toCharArray();

        for (int i = 0; i < cArr.length; i++) {
            int idx = cArr[i] - 'a'; 
            
            if (iArr[idx] == -1) { 
                iArr[idx] = i;
            }
        }

        for (int n : iArr) {
            bw.write(n + " "); 
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
