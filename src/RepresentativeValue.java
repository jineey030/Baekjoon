import java.util.Arrays;
import java.util.Scanner;

public class RepresentativeValue {
    public static void main (String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];

        int avg = 0;
        int mid = 0;

        for(int i=0; i<5; i++){
            list[i] = sc.nextInt();
            avg += list[i];
        }

        sc.close();

        avg = avg/5;

        Arrays.sort(list);
        mid = list[2];

        System.out.println(avg);
        System.out.println(mid);

    }
}
