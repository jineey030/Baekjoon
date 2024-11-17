import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackTest2 {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stackList = new Stack<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < num; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);

            switch(st.nextToken()) {
                case "1" :
                stackList.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2" :
                    if(stackList.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(stackList.pop()).append('\n');
                    break;
                case "3" :
                    sb.append(stackList.size()).append('\n');
                    break;
                case "4" :
                    if(stackList.isEmpty())
                        sb.append(1).append('\n');
                    else
                        sb.append(0).append('\n');
                    break;
                case "5" :
                    if(stackList.isEmpty())
                        sb.append(-1).append('\n');
                    else
                        sb.append(stackList.peek()).append('\n');
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
