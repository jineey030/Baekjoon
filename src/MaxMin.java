
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        //정수의 개수
        int n = sc.nextInt();
        //N개의 정수
        int[] list = new int[n];

        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }

        //오름차순 정렬 
        Arrays.sort(list);
        System.out.print(list[0]+" "+list[n-1]);
    }
}
