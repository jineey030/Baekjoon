import java.io.*;
import java.util.*;

class BOJ2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n; i++){
            //풍선의 인덱스(i), 풍선 안의 종이(이동 범위)
            deque.add(new int[] {(i+1), arr[i]});
        }

        StringBuilder sb = new StringBuilder();
        
        //1번 풍선부터 시작
        int move = arr[0]; //다음 이동해야 하는 범위
        sb.append("1 "); //지운 풍선의 인덱스
        
        while(!deque.isEmpty()){
            //양수
            if(move > 0){
                for(int i=1; i < move; i++){
                    deque.add(deque.poll()); //앞에 있는 풍선들을 move만큼 뒤로 이동
                }

                //이번 풍선의 인덱스 번호와 안에 들어있는 종이 찾기
                int[] next = deque.poll(); 
                move = next[1]; //다음 이동해야 하는 범위
                sb.append(next[0]+ " "); //이번에 지운 풍선의 인덱스
            } else {
                for(int i=1; i < -move; i++){
                    deque.addFirst(deque.pollLast()); //뒤에 있는 풍선들을 move만큼 앞으로 이동 
                }

                int[] next = deque.pollLast();
                move = next[1];
                sb.append(next[0]+ " ");
            }
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }
}
