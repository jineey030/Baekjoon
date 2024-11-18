
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackTest {
    public static void main(String[] args) throws Exception {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String r = "";
        Integer x = null;

        for(int i=0; i<n; i++){
            StringTokenizer req = new StringTokenizer(br.readLine());

            if(req.countTokens() > 1){
                r = req.nextToken();
                x = Integer.valueOf(req.nextToken());
            } else {
                r = req.nextToken();
            }

            switch (r) {
                    case "push" : if (x != null) {
                                        stack.push(x);  // x가 null이 아니면 푸시
                                    }
                                    break;
                    case "pop": if(stack.isEmpty()){
                                    System.out.println(-1);
                                } else {
                                    System.out.println(stack.pop());
                                }
                                 break;
                    case "size" : System.out.println(stack.size()); break;
                    case "empty" : if(stack.isEmpty()){
                                        System.out.println(1);
                                    } else {
                                        System.out.println(0);
                                    }
                                    break;
                    case "top" : if(stack.isEmpty()){
                                        System.out.println(-1);
                                    } else {
                                        System.out.println(stack.peek());
                                    }
                                    break;
                    default:
                                    break;
                
            }

        }

    }
}