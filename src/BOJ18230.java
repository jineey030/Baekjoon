
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ18230 {
    static int n, a, b;
    static Integer[] arr;
    static Integer[] brr; 

    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        arr = new Integer[a];
        brr = new Integer[b];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(brr, Collections.reverseOrder());

        int idx1 = 0;
        int idx2 = 0;

        if(n % 2 == 1){
            result += arr[idx1];
            idx1++;
            n--;
        }

        while(n > 0){
            if(idx1 + 1 >= a){
                while(n > 0){
                    result += brr[idx2];
                    idx2++;
                    n -= 2;
                }
                break;
            }

            if(idx2 >= b){
                while(n > 0){
                    result += arr[idx1] + brr[idx1 + 1];
                    idx1 += 2;
                    n -= 2;
                }

                break;                   
            }

            if(arr[idx1] + arr[idx1 + 1] <= brr[idx2]){
                result += brr[idx2];
                idx2++;
            } else {
                result += arr[idx1] + arr[idx1 + 1];
                idx1 += 2;
            }

            n -= 2;
        }
      
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}
