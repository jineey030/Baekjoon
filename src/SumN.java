import java.util.Scanner;

public class SumN {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum += i;
        }
        
        System.out.println(sum);

    }

}
