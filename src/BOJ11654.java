import java.io.IOException;
import java.util.Scanner;

class BOJ11654 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        char inputChar = sc.next().charAt(0);
        int asciiValue = (int) inputChar;
        
        System.out.println(asciiValue);
    }
}