import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strs = new String[n];

        for(int i = 0; i < n; i++){
            strs[i] = br.readLine();
        }

        int cnt = 0;

        for (String str : strs) {
            boolean isGroupWord = true;  
            boolean[] appeared = new boolean[26];

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if (i > 0 && str.charAt(i) != str.charAt(i - 1)) {
                    if (appeared[currentChar - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                }

                appeared[currentChar - 'a'] = true; 
            }

            if (isGroupWord) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
