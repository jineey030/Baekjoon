import java.util.Scanner;

public class TileTest {
    public static int[] dp = new int[1000001];;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1; //00
		dp[2] = 2; //00 11
 
		//-1 로 초기화 (값이 아직 계산되지 않았음을 나타내기 위해)
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(Tile(n));
		
	}
	
	public static int Tile(int n) {
 
		if (n == 1) {
			return 1;
		} 
 
		if (n == 2) {
			return 2;
		}
 
		// 초기 값 
		int val1 = 1;
		int val2 = 2;
		int sum = 0;
 
		for (int i = 2; i < n; i++) {
			sum = (val2 + val1) % 15746;	// 이전 값과 이전의 이전 값의 합 
			val1 = val2;	// 이전의 이전 값은 이전 값으로 변경 
			val2 = sum;		// 이전 값은 현재 합 값으로 변경 
		}
 
		return sum;
 
	}
}
