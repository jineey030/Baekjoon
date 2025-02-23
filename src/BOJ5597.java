import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] check = new boolean[30];

        for(int i=0; i<28; i++){
            int n = Integer.parseInt(br.readLine());

            check[n-1] = true;
        }

        for(int i=0; i<30; i++){
            if(!check[i]){
                bw.write(String.valueOf(i+1)+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}