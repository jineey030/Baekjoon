import java.util.Scanner;

public class BOJ1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        
        int n = 1; 
        int sum = 1; 

        while (sum < X) {
            n++;
            sum += n;
        }

        int prevSum = sum - n;  
        int indexInGroup = X - prevSum; 
        
        int numerator, denominator;
        if (n % 2 == 0) {
            numerator = indexInGroup;
            denominator = n - indexInGroup + 1;
        } else {
            numerator = n - indexInGroup + 1;
            denominator = indexInGroup;
        }

        System.out.println(numerator + "/" + denominator);
    }
}
