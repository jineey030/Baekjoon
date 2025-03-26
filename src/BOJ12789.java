import java.io.*;
import java.util.*;

class BOJ12789 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int expected = 1; 

        while (!queue.isEmpty()) {
            if (queue.peek() == expected) { 
                queue.poll(); 
                expected++; 
            } else if (!stack.isEmpty() && stack.peek() == expected) { 
                stack.pop(); 
                expected++;
            } else { 
                stack.push(queue.poll()); 
            }
        }

        while (!stack.isEmpty() && stack.peek() == expected) {
            stack.pop();
            expected++;
        }

        if (stack.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

        sc.close();
    }
}
