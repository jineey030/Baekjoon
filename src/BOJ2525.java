import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int mins = Integer.parseInt(br.readLine());

        a += mins/60;
        mins = mins%60;
        b += mins;

        if(b >= 60){
            b = b - 60;
            a++;
        }

        if(a > 23){
            a -= 24;
        }

        bw.write(a + " " + b);
        bw.flush();
        bw.close();
        br.close();
    }
}