import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ2566 {
    static int max;
    static String point;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        max = Integer.MIN_VALUE;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    point = (i + 1) + " " + (j + 1);
                }
            }
        }

        bw.write(String.valueOf(max)+"\n");
        bw.write(point);
        bw.flush();
        bw.close();
        br.close();
    }
}