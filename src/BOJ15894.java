import java.io.*;

public class BOJ15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long n = Long.parseLong(br.readLine()); 
        System.out.print(4 * n);
    }
}