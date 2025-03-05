import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        String str;

        while(!(str = br.readLine()).equals("0 0")){
            st = new StringTokenizer(str);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a < b){
                if(b % a == 0){
                    bw.write("factor"+"\n");
                } else {
                    bw.write("neither"+"\n");
                }
            } else {
                if(a % b == 0){
                    bw.write("multiple"+"\n");
                } else {
                    bw.write("neither"+"\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}