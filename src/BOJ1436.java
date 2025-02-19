import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ1436 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       int n = Integer.parseInt(br.readLine());

       bw.write(String.valueOf(makeMovie(n)));
       bw.flush();
       bw.close();
       br.close();
    }

    public static int makeMovie(int n){
        int i = 666;
        int cnt = 0;
        int num = 0;

        while(n <= 100000){
            if(Integer.toString(i).contains("666")){
                ++cnt;

                if(cnt == n) {
                    num = i;
                    break;
                }    
            } 

            i++;
        }

        return num;
    }
}