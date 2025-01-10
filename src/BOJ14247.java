
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ14247 {
    static int[][] trees;

    static int n;
    static long result = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        trees = new int[n][2];

		for (int i=0; i<n; i++) {
			trees[i][0] = Integer.parseInt(st1.nextToken()); 
			trees[i][1] = Integer.parseInt(st2.nextToken()); 
		}

        cut(trees);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static void cut(int[][] trees){
        Arrays.sort(trees, (o1, o2) -> o1[1] - o2[1]);

        for(int i=0; i<n; i++){
            result += trees[i][0] + (i * trees[i][1]);
        }
    }
 }
