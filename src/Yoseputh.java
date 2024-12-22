
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Yoseputh {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for(int i=1; i<=n; i++){
            list.add(i);
        }

        sb.append('<');

        while(!list.isEmpty()){
            for(int i=0; i<k; i++){
                if(i == k-1){
                    if(list.size() == 1){
                        sb.append(list.remove());

                    } else {
                        sb.append(list.remove() + ", ");
                    }
                } else {
                    list.add(list.remove());
                }
            }
        }

        sb.append('>');
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}