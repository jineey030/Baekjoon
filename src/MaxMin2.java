import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class MaxMin2 {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) { //다음 토큰이 있을 경우 true, 없으면 false 반환
			int val = Integer.parseInt(st.nextToken()); //다음 토큰을 읽음
			if(val>max) {
				max = val;
			}
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
}
