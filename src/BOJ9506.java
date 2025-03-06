import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class BOJ9506 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n;

        while((n = Integer.parseInt(br.readLine())) != -1){
            check(n);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void check(int n) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int i = 1; i < n; i++) { 
            if(n % i == 0){
                sum += i;
                list.add(i);
            }
        }

        if(sum == n){
            bw.write(n + " = ");

            for(int i = 0; i < list.size(); i++){
                bw.write(String.valueOf(list.get(i)));

                if(i < list.size() - 1) {
                    bw.write(" + ");
                }
            }
            
            bw.newLine();
        } else {
            bw.write(n + " is NOT perfect.\n"); 
        }
    }
}
