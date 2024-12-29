
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class WordTest {
    public static void main(String[] args) throws Exception {
        HashMap<Character, Integer> map = new HashMap<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toLowerCase();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        for (int count : map.values()) {
            maxCount = Math.max(maxCount, count);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.append(entry.getKey());
            }
        }

        if (result.length() > 1) {
            bw.write("?");
        } else {
            bw.write(result.toString().toUpperCase());
        }

        bw.flush();
        bw.close();

    }
}
