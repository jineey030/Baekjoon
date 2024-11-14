import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class deSum {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();
        
        int m = 0;
        
        for(int i = 1; i <= n; i++) {
            int number = i;
            int res = 0; 
            
            while(number > 0){ 
                res += number % 10;
                number /= 10; 
            }

            if(res + i == n){ 
                m = i;
                break; 
            }
        }
        bw.write(m + "\n");
        bw.flush();
        bw.close();

    }
}
