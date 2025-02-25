import java.io.IOException;
import java.util.Scanner;

class BOJ9498 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int point = sc.nextInt();

        if(90 <= point){
            System.out.print("A");
        } else if(80 <= point){
            System.out.print("B");
        } else if(70 <= point){
            System.out.print("C");
        } else if(60 <= point){
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}