import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FastPlus {
    public static void main(String[] args) throws Exception {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());

        //입력 받은 문자열
        for(int i=0; i < t; i++){
            String[] result = br.readLine().split(" ");
            bw.write((Integer.parseInt(result[0]) + Integer.parseInt(result[1]))+"\n");
        }

        bw.close();
    }
}
