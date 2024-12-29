
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class KingQueenTest {
    static int[] list = new int[6];
    static int[] piece = {1, 1, 2, 2, 2, 8};

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<6; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<6; i++){
            sb.append(piece[i]-list[i]).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}