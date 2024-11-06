
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Receipt {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //영수증에 적힌 총 금액
        int x = Integer.parseInt(br.readLine());

        //구매한 물건의 종류의 수
        int n = Integer.parseInt(br.readLine());

        //총 금액의 수
        int sum = 0;

        for(int i=0; i<n; i++){
            String[] result = br.readLine().split(" ");
            sum += Integer.parseInt(result[0]) * Integer.parseInt(result[1]);
        }

        if(x == sum){
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.close();
    }
}
