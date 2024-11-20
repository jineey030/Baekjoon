import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class NumberCard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> nList = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            String number = st.nextToken();
            nList.add(Integer.parseInt(number));
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int mNum = Integer.parseInt(str.nextToken());

            if(nList.contains(mNum)){
                sb.append('1').append(' ');
            } else {
                sb.append('0').append(' ');
            }
        }

        System.out.println(sb);

    }
}
