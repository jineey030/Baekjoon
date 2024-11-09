import java.util.Scanner;

public class array{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] nArray = new int[n][m];
        int[][] mArray = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                nArray[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mArray[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(nArray[i][j] + mArray[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}