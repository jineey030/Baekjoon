import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());

            if(num < x){
                sb.append(num + " ");
            }
        }

        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}