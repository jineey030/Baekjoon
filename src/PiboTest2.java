import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PiboTest2 {
    private static Map<Integer, Long> map = new HashMap<>();
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(pibo(n));
    }

    private static long pibo(int n){
        
        if(n < 2){
            return n; 
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        long result = pibo(n-1) + pibo(n-2);
        map.put(n, result);

        return result;
    }
}
