import java.io.*;
import java.util.Stack;

class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            char[] arr = br.readLine().toCharArray();
            boolean isValid = true;

            for (char c : arr) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {  
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            if (isValid && stack.isEmpty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
