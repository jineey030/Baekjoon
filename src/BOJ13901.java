import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13901 {
    static int R, C, sr, sc, count;
	static int[][] map;
	static int[][] deltas = {{0, 0}, {-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 
	static int[] dir;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R][C];

		int K = Integer.parseInt(br.readLine());
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1; 
		}

		st = new StringTokenizer(br.readLine());
		sr = Integer.parseInt(st.nextToken());
		sc = Integer.parseInt(st.nextToken());

		map[sr][sc] = 1; 

		dir = new int[4];

		st = new StringTokenizer(br.readLine());
		for (int i=0;i<4;i++) {
			dir[i] = Integer.parseInt(st.nextToken()); 
		}

		count = 0;

		loop(0);

		System.out.println(sr + " " + sc); 
	}
	
	static void loop(int d) {
		while(true) {
			int nr = sr+deltas[dir[d]][0];
			int nc = sc+deltas[dir[d]][1];

			if (isValid(nr, nc) && map[nr][nc]==0) {
				map[nr][nc] = 1;
				sr = nr; sc = nc;
				count = 0;
			} else { 
				d=(d+1)%4; 
				count++;
			}

			if (count==4) break; 
		}
	}
	
	static boolean isValid(int nr, int nc) {
		return nr>=0 && nr<R && nc>=0 && nc<C;
	}
}
