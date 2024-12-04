
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CoordinateSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(str.nextToken());
            int y = Integer.parseInt(str.nextToken());
            
            map.putIfAbsent(x, new ArrayList<>());
            map.get(x).add(y);
        }

        ArrayList<Integer> keyArr = new ArrayList<Integer>(map.keySet());
        Collections.sort(keyArr);

        for(int key : keyArr){
            ArrayList<Integer> valueList = map.get(key);
            Collections.sort(valueList);

            for(int value : valueList){
                System.out.println(key+ " " +value);
            }
        }

    }
}
