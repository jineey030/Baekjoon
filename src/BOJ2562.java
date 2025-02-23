import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;  
        int cnt = 0;  
        int lineCount = 1; 

        String num;

        while ((num = br.readLine()) != null && !num.isEmpty()) {  
            int currentNum = Integer.parseInt(num);
            
            if (currentNum > max) {  
                max = currentNum;
                cnt = lineCount;  
            }
            lineCount++;  
        }

        bw.write(max + "\n");
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
