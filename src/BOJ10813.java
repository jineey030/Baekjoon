import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];

        for(int k=1; k<=n; k++){
            basket[k-1] = k;
        }

        for(int k=0; k<m; k++){
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = basket[j-1];

            basket[j-1] = basket[i-1];
            basket[i-1] = temp;
        }

        for(int num : basket){
            bw.write(num + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}