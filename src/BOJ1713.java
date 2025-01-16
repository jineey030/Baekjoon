
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ1713 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int recommend = Integer.parseInt(br.readLine());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<recommend; i++){
            int student = Integer.parseInt(st.nextToken());

            if(map.containsKey(student)){
                map.put(student, map.get(student)+1);
            } else {
                if(map.size() == n){
                    int minId = map.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
                    map.remove(minId);
                }
                map.put(student, 1);
            }
        }

        map.keySet().stream().sorted()
            .forEach(id -> {
                try {
                    bw.write(id + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        bw.flush();
        bw.close();
        br.close();
    }
}