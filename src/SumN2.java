import java.util.Scanner;

public class SumN2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println(num * (num+1) / 2);

    }

}
