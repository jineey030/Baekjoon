import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            char[] arr = br.readLine().toCharArray();
            
            bw.write(String.valueOf(arr[0])+String.valueOf(arr[arr.length-1])+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}