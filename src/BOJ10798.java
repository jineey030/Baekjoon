import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] arr = new String[5][15]; 

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                arr[i][j] = ""; 
            }
        }

        // Read input and populate the array
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                arr[i][j] = String.valueOf(input.charAt(j)); 
            }
        }

        for (int i = 0; i < 15; i++) {  
            for (int j = 0; j < 5; j++) { 
                bw.write(arr[j][i]);  
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
