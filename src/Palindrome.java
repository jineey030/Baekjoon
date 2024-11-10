import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        char[] re = new char[ch.length];

        for(int i=0; i<ch.length; i++){
            re[re.length-i-1] = ch[i];
        }

        if(String.valueOf(ch).equals(String.valueOf(re))){
            System.out.print("1");
        } else {
            System.out.print("0");
        }
        
    }
    
}
