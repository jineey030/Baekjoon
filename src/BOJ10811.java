import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] bucket = new int[n];

        for(int k=0; k<n; k++){
            bucket[k] = k+1;
        }

        for(int k=0; k<m; k++){
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken())-1;
            int j = Integer.parseInt(st.nextToken())-1;

            while (i < j) {
                int temp = bucket[i];

                bucket[i] = bucket[j];
                bucket[j] = temp;
                
                i++;
                j--;
            }
        }

        for(int num : bucket){
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}