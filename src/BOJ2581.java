import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ2581 {
    static int sum = 0;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for(int i=m; i<=n; i++){
            if(isPrime(i)){
                sum += i;
                min = Math.min(min, i);
            }
        }

        if(sum == 0){
            bw.write("-1");
        } else {
            bw.write(String.valueOf(sum) + "\n");
            bw.write(String.valueOf(min));
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isPrime(int num){
        if (num < 2) return false; 

        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) return false;
        }

        return true;
    }
}