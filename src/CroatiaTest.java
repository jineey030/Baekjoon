import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CroatiaTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};  

        int cnt = 0;
        String str = br.readLine();

        int i = 0;
        while (i < str.length()) {
            boolean found = false; 

            for (String s : alphabet) {
                if (str.startsWith(s, i)) {
                    cnt++; 
                    i += s.length();  
                    found = true; 
                    break;  
                }
            }

            if (!found) {
                cnt++;
                i++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
}
