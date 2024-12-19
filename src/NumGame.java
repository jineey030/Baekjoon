import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NumGame{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] cards = new int[n][5];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                cards[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            int max = -1;

            for(int j=0; j<5; j++){
                for(int k=j+1; k<5; k++){
                    for(int l=k+1; l<5; l++){
                        int sum = cards[i][j] + cards[i][k] + cards[i][l];
                        int digit = sum % 10;

                        if(digit > max){
                            max = digit;
                        }
                    }
                }
            }

            result[i] = max;
        }

        int winner = -1;
        int max = -1;

        for (int i = 0; i < n; i++) {
            if(result[i] > max || (result[i] == max && i > winner)){
                max = result[i];
                winner = i;
            }
        }

        bw.write((winner+1)+"\n");
        bw.flush();
        bw.close();
    }
}