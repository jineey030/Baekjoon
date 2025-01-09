import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BOJ2529 {
    static int n;
    static String[] arr;
    static boolean[] visited;
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        arr = br.readLine().split(" ");

        visited = new boolean[10];

        dfs("", 0);

        bw.write(list.get(list.size() - 1) + "\n");
        bw.write(list.get(0) + "\n");
        bw.flush();
        bw.close();
    }

    public static void dfs(String num, int idx) {
        if(idx == n+1){
            list.add(num);
            return;
        }

        for(int j = 0; j < 10; j++) {
			if(visited[j]) {
				continue;				
			}

			if(idx == 0 || ckeck(Character.getNumericValue(num.charAt(idx - 1)), j , arr[idx-1])) {
				visited[j] = true;

				dfs(num+j, idx+1);
				visited[j] = false;				
			}
		}
    }

    static boolean ckeck(int a, int b, String c) {
		if (c.equals(">")) {
			if(a < b) return false;
		} else if (c.equals("<")){
			if(a > b) return false;
		}
		return true;
	}
}