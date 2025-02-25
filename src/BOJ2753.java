import java.io.IOException;
import java.util.Scanner;

class BOJ2753 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println("1");
            } else {
                System.err.println("0");
            }
        } else {
            System.err.println("0");
        }
    }
}