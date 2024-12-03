
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.StringTokenizer;

public class AgeSort {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, List<String>> list = new LinkedHashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer st =  new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            
            // 같은 나이에 대해 리스트로 추가
            list.computeIfAbsent(age, k -> new ArrayList<>()).add(name);
        }

        List<Integer> keySet = new ArrayList<>(list.keySet());

        Collections.sort(keySet);

        for(Integer key : keySet){
            for(String name : list.get(key)){
                System.out.println(key + " " + name);
            }
        }

    }
}
