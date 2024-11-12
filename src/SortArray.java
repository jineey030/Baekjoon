import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[] result = new int[cnt];

        for(int i=0; i<cnt; i++){
            result[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(result);

        for(int val : result){
            System.out.println(val);
        }

    }

}
