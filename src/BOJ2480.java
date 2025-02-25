import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

class BOJ2480 {
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            int key = Integer.parseInt(arr[i]);

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        if (map.size() == 1) {  
            for (int key : map.keySet()) {
                result = 10000 + key * 1000;
            }
        } else if (map.size() == 2) { 
            for (int key : map.keySet()) {
                if (map.get(key) == 2) {
                    result = 1000 + key * 100;
                }
            }
        } else {  
            int max = 0;
            
            for (int key : map.keySet()) {
                max = Math.max(max, key);
            }
            result = max * 100;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
