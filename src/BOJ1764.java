import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<n+m; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name, 0)+1);
        }

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        bw.write(String.valueOf(list.size())+ "\n");

        for(String str : list){
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
        
    }
}