import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class BOJ1018 {
    static int n, m, cnt;
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = br.readLine().split(" ");

        m = Integer.parseInt(size[0]);
        n = Integer.parseInt(size[1]);

        board = new char[m][n];

        for (int i = 0; i < m; i++) {
            String row = br.readLine();
            
            for (int j = 0; j < n; j++) {
                board[i][j] = row.charAt(j);  
            }
        }

        check();

        bw.append(String.valueOf(cnt));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void check(){
        cnt = Integer.MAX_VALUE;

        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                int changesForWhite = 0;
                int changesForBlack = 0;
                
                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (board[i + x][j + y] != 'W') changesForWhite++;
                            if (board[i + x][j + y] != 'B') changesForBlack++;
                        } else {
                            if (board[i + x][j + y] != 'B') changesForWhite++;
                            if (board[i + x][j + y] != 'W') changesForBlack++;
                        }
                    }
                }
                
                cnt = Math.min(cnt, Math.min(changesForWhite, changesForBlack));
            }
        }
    }
}