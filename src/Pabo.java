import java.util.*;

public class Pabo {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n){

        if(n < 2) {
            return n;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        int result = fibonacci(n-1)+fibonacci(n-2);

        map.put(n, result);

        return result;
    }
}
