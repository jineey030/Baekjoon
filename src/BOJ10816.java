import java.io.*;
import java.util.*;

class BOJ10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(num, 0) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
