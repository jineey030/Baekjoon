import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bansanhui {
    static int[][] apt = new int[15][15];
    static StringBuilder sb = new StringBuilder();

    static int lives(int k, int n) {
        for(int i = 0; i < 15; i++) { //미리 만들어두기
			apt[i][1] = 1; //1호는 무조건 1명
			apt[0][i] = i; //0층은 호수와 거주민 수가 같음
		}

        for(int i = 1; i < 15; i ++) {
			for(int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}

        return apt[k][n];
    }

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
            sb.append(lives(k,n)).append('\n');
		}

        System.out.print(sb.toString());
	}
}