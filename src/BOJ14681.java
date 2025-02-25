import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(quadrant(x, y)));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int quadrant(int x, int y){
        int result = 0;

        if(x > 0){
            if(y > 0){
                result = 1;
            } else {
                result = 4;
            }
        } else {
            if(y > 0){
                result = 2;
            } else {
                result = 3;
            }
        }
        
        return result;
    }
}