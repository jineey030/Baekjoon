import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2588 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();

        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(String.valueOf(num2.charAt(i)));
        }

        int result1 = num1 * arr[2];
        int result2 = num1 * arr[1];
        int result3 = num1 * arr[0];
        int result = num1 * Integer.parseInt(num2);

        bw.write(String.valueOf(result1+"\n"+result2+"\n"+result3+"\n"+result));
        bw.flush();
        bw.close();
        br.close();
    }
}
