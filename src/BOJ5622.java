import java.util.Scanner;

public class BOJ5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();  
        
        int totalTime = 0; 
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            totalTime += getDialTime(ch);  
        }
        
        System.out.println(totalTime);
    }
    
    public static int getDialTime(char ch) {
        if (ch >= 'A' && ch <= 'C') {
            return 3; 
        } else if (ch >= 'D' && ch <= 'F') {
            return 4;  
        } else if (ch >= 'G' && ch <= 'I') {
            return 5;  
        } else if (ch >= 'J' && ch <= 'L') {
            return 6; 
        } else if (ch >= 'M' && ch <= 'O') {
            return 7;  
        } else if (ch >= 'P' && ch <= 'S') {
            return 8;  
        } else if (ch >= 'T' && ch <= 'V') {
            return 9;  
        } else if (ch >= 'W' && ch <= 'Z') {
            return 10; 
        }
        return 0;  
    }
}
