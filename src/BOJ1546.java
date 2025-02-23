import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;

            if(max < arr[i]){
                max = arr[i];
            }
        }

        double sum = 0.0;

        for(double nums : arr){
            nums = nums/max*100;
            sum += nums;
        }

        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
        br.close();

    }
}