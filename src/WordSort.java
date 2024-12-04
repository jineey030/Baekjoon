import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class WordSort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        Map<String, Integer> list = new TreeMap<>((word1, word2) -> {
            if (word1.length() != word2.length()) {
                return Integer.compare(word1.length(), word2.length());
            }

            return word1.compareTo(word2);
        });

        String words;

        for (int i = 0; i < n; i++) {
            words = br.readLine();
            list.put(words, words.length());
        }

        for (String word : list.keySet()) {
            System.out.println(word);
        }
    }
}
