import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class BOJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = br.readLine().split(" ");
        int[] sorted = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            sorted[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            int num = Integer.parseInt(s);
            sb.append(map.get(num)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}