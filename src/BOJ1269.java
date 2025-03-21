import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ1269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(arr[0]);

        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(scanner.nextInt());
        }
        
        int m = Integer.parseInt(arr[1]);
        
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(scanner.nextInt());
        }
        
        Set<Integer> symmetricDiff = new HashSet<>(setA);
        Set<Integer> tempSetB = new HashSet<>(setB);

        symmetricDiff.removeAll(setB);
        tempSetB.removeAll(setA); 
        symmetricDiff.addAll(tempSetB); 

        System.out.println(symmetricDiff.size());

        scanner.close();
    }
}
