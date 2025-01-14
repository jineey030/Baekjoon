import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10157 {
    static int c, r, k;
    static int[][] seats;
    static String result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        c = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        k = Integer.parseInt(st.nextToken());

        seats = new int[r][c];

        if(k > r*c){
            bw.write("0");
            bw.flush();
            bw.close();
            br.close();
        } else {
            bw.write(makeSeat());
            bw.flush();
            bw.close();
            br.close();
        }
    }

    public static String makeSeat() {
        int[] dx = {-1, 0, 1, 0}; // 위, 오른쪽, 아래, 왼쪽
        int[] dy = {0, 1, 0, -1}; // 위, 오른쪽, 아래, 왼쪽

        int row = r-1, col = 0; 
        int direction = 0; // 0: 위, 1: 오른쪽, 2: 아래, 3: 왼쪽
        int person = 1; 

        while (person <= r * c) {
            if (seats[row][col] == 0) {
                seats[row][col] = person; 

                if (person == k) {
                    result = (col + 1) + " " + (r - row);
                }

                person++;
            }

            int nextRow = row + dx[direction];
            int nextCol = col + dy[direction];

            if (nextRow >= 0 && nextRow < r && nextCol >= 0 && nextCol < c && seats[nextRow][nextCol] == 0) {
                row = nextRow;
                col = nextCol;
            } else { 
                //방향 전환
                direction = (direction + 1) % 4; 

                row += dx[direction]; 
                col += dy[direction]; 
            }
        }

        return result; 
    }
}
