import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

class BOJ2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            queue.offer(i);
        }

        while(queue.size() > 1){
            queue.poll();
            queue.offer(queue.poll());
        }

        bw.write(String.valueOf(queue.poll()));
        bw.flush();
        bw.close();
        br.close();
    }
}