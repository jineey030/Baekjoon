import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NumberJump {
    static Set<String> result = new HashSet<>();
    static String[][] board = new String[5][5];
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j] = st.nextToken();
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                dfs(i, j, 0, board[i][j]);
            }
        }

        bw.write(result.size()+"\n");
        bw.flush();
        bw.close();
    }

    public static void dfs(int x, int y, int cnt, String num){
        if(cnt == 5){
            if(!result.contains(num)){
                result.add(num);
            }
            return;
        }

        for(int k=0; k<4; k++){
            int nx = x + dr[k];
            int ny = y + dc[k];

            if(nx < 0 || nx >=5 || ny < 0 || ny >= 5){
                continue;
            }

            dfs(nx, ny, cnt+1, num+board[nx][ny]);
        }
    }
}
