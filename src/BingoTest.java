import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BingoTest {
    static int cnt = 0; // 숫자 부른 횟수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] bingo = new int[5][5];

        // 빙고 칸 채우기
        for (int i = 0; i < 5; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                bingo[i][j] = Integer.parseInt(str.nextToken());
            }
        }

        // 사회자 숫자 체크
        for (int i = 0; i < 5; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int calledNumber = Integer.parseInt(str.nextToken());

                if (bingoCheck(bingo) >= 3) {
                    continue;
                } else {
                    cnt++; // 부른 횟수 증가
                }

                // 호출된 숫자를 빙고판에서 찾고, 그 칸을 0으로 마킹
                for (int k = 0; k < 5; k++) {
                    for (int l = 0; l < 5; l++) {
                        if (bingo[k][l] == calledNumber) {
                            bingo[k][l] = 0; // 호출된 숫자는 0으로 마킹
                        }
                    }
                }
            }
        }

        if(bingoCheck(bingo) >= 3){
            System.out.println(cnt);
        }
        
    }

    // 빙고 체크 메소드
    private static int bingoCheck(int[][] bingo) {
        int bingoCnt = 0;

        // 가로 체크
        for (int i = 0; i < 5; i++) {
            boolean rowBingo = true;
            for (int j = 0; j < 5; j++) {
                if (bingo[i][j] != 0) {
                    rowBingo = false;
                    break;
                }
            }
            if (rowBingo) bingoCnt++;
        }

        // 세로 체크
        for (int i = 0; i < 5; i++) {
            boolean colBingo = true;
            for (int j = 0; j < 5; j++) {
                if (bingo[j][i] != 0) {
                    colBingo = false;
                    break;
                }
            }
            if (colBingo) bingoCnt++;
        }

        // 왼쪽 위에서 오른쪽 아래 대각선 체크
        boolean leftBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][i] != 0) {
                leftBingo = false;
                break;
            }
        }
        if (leftBingo) bingoCnt++;

        // 오른쪽 위에서 왼쪽 아래 대각선 체크
        boolean rightBingo = true;
        for (int i = 0; i < 5; i++) {
            if (bingo[i][4 - i] != 0) {
                rightBingo = false;
                break;
            }
        }
        if (rightBingo) bingoCnt++;

        return bingoCnt; // 완성된 빙고의 개수
    }
}
