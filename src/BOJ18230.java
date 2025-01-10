import java.io.*;
import java.util.*;

public class BOJ18230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Integer[] first = new Integer[a];
        Integer[] second = new Integer[b];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            first[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            second[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(first, Collections.reverseOrder());
        Arrays.sort(second, Collections.reverseOrder());

        int ans = 0;
        int one = 0;
        int two = 0;

        if(n % 2 == 1){
            ans += first[one];
            one++;
            n--;
        }
        
        while(n > 0){
            if(one+1 >= a){
                while(n > 0){
                    ans += second[two];
                    two++;
                    n-=2;
                }
                break;
            }

            if(two >= b){
                while(n > 0){
                    ans += first[one] + first[one+1];
                    one+=2;
                    n-=2;
                }
                break;
            }

            if(first[one] + first[one+1] <= second[two]){
                ans += second[two];
                two++;
            }else{
                ans+= first[one] + first[one+1];
                one+=2;
            }
            n-=2;
        }

        bw.write(ans+"");
        br.close();
        bw.close();
    }
}