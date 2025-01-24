import java.util.*;

public class BOJ2823 {
    static int R, C;
    static char[][] map;

    //위, 아래, 왼쪽, 오른쪽
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    
    static boolean isValid(int r, int c) {
        return r >= 0 && r < R && c >= 0 && c < C && map[r][c] == '.';
    }
    
    static boolean hasDeadEnd(int r, int c) {
        int count = 0;
        
        for (int i = 0; i < 4; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (isValid(nr, nc)) {
                count++;
            }
        }

        return count == 1;
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        R = sc.nextInt();
        C = sc.nextInt();

        map = new char[R][C];
        for (int i = 0; i < R; i++) {
            map[i] = sc.next().toCharArray();
        }
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == '.') {
                    if (hasDeadEnd(i, j)) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }
        
        System.out.println(0);
    }
}
