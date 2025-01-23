
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ2659 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String num = "";

        for(int i=0; i<4; i++){
            num += st.nextToken();
        }

        int inputNums = findClockNum(num);
        int cnt = 1;

        for (int i=1111; i<=inputNums; i++) {
            if (i == inputNums) {
                bw.write(String.valueOf(cnt));
                break;
            }

            if (!String.valueOf(i).contains("0") && findClockNum(String.valueOf(i)) == i) {
                cnt++;
            }
        }
 
        bw.flush();
        bw.close();
        br.close();
    }

    static int findClockNum(String num){
        int min = Integer.parseInt(num);

        Queue<String> q = new LinkedList<>();
 
        for (int i = 0; i < num.length(); i++) {
            q.add(String.valueOf(num.charAt(i)));
        }
 
        for (int j = 1; j < q.size(); j++) {
            q.add(q.remove());

            int nowNum = Integer.parseInt(q.stream().collect(Collectors.joining("")));
            min = min > nowNum ? nowNum : min;
        }
 
        return min;
    }
}