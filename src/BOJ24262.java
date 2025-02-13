import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ24262 {
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        bw.write(menOfPassion(n)+"\n");
        bw.write(String.valueOf(0));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int menOfPassion(int n){
        return ++cnt;
    }
}