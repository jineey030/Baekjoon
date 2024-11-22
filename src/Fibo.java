import java.util.*;

public class Fibo {

    private static int fibCnt = 0;
    private static int fibonacciCnt = 0;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fib(n);
        fibonacci(n);

        System.out.println(fibCnt + " "+ fibonacciCnt);
    }

    public static int fib(int n) {
        if (n == 1 || n == 2){
            fibCnt++;
            return 1;
        }  else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int fibonacci(int n){
        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            fibonacciCnt++;
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

}
