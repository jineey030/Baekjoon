import java.io.*;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String line;

        while ((line = br.readLine()) != null) {  
            StringTokenizer st = new StringTokenizer(line); 

            int A = Integer.parseInt(st.nextToken());  
            int B = Integer.parseInt(st.nextToken()); 

            bw.write((A + B) + "\n"); 
        }
        
        br.close();
        bw.flush();  
        bw.close();
    }
}
