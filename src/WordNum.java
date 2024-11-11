import java.util.Scanner;
import java.util.StringTokenizer;

public class WordNum {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        sc.close();

        StringTokenizer check = new StringTokenizer(input);
        
        int cnt = 0;

        while(check.hasMoreTokens()){
            check.nextToken();
            cnt++;
        }

        System.out.print(cnt);
    }
}
