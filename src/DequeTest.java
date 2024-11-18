
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DequeTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            switch(str.nextToken()){
                case "1" : deque.addFirst(Integer.parseInt(str.nextToken())); break;
                case "2" : deque.addLast(Integer.parseInt(str.nextToken())); break;
                case "3" : if (deque.isEmpty()) {sb.append(-1).append('\n');} else {sb.append(deque.removeFirst()).append('\n');} break;
                case "4" : if (deque.isEmpty()) {sb.append(-1).append('\n');} else {sb.append(deque.removeLast()).append('\n');} break;
                case "5" : sb.append(deque.size()).append('\n'); break;
                case "6" : if (deque.isEmpty()) {sb.append(1).append('\n');} else {sb.append(0).append('\n');} break;
                case "7" : if (deque.isEmpty()) {sb.append(-1).append('\n');} else {sb.append(deque.peekFirst()).append('\n');} break;
                case "8" : if (deque.isEmpty()) {sb.append(-1).append('\n');} else {sb.append(deque.peekLast()).append('\n');} break;
            }
        }

        System.out.println(sb);
    }
}
