import java.util.*;

public class BOJ3085 {

    static int N;
    static char[][] board;

    static int getMaxCandies(char[][] board) {
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (board[i][j] == board[i][j - 1]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (board[i][j] == board[i - 1][j]) {
                    count++;
                } else {
                    max = Math.max(max, count);
                    count = 1;
                }
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        board = new char[N][N];
        
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextLine().toCharArray();
        }

        int maxCandies = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                char temp = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = temp;

                maxCandies = Math.max(maxCandies, getMaxCandies(board));

                temp = board[i][j];
                board[i][j] = board[i][j + 1];
                board[i][j + 1] = temp;
                
                if (i < N - 1) {
                    temp = board[i][j];
                    board[i][j] = board[i + 1][j];
                    board[i + 1][j] = temp;

                    maxCandies = Math.max(maxCandies, getMaxCandies(board));

                    temp = board[i][j];
                    board[i][j] = board[i + 1][j];
                    board[i + 1][j] = temp;
                }
            }
        }

        System.out.println(maxCandies);
    }
}
