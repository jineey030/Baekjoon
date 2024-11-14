import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BruteForce {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer nm = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(nm.nextToken());
        int m = Integer.parseInt(nm.nextToken());

        nm =  new StringTokenizer(br.readLine());
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(nm.nextToken());
        }

        int result = 0;

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i]+nums[j]+nums[k] <= m){
                        result = Math.max(result, nums[i]+nums[j]+nums[k]);
                    }
                }
            }
        }

        System.out.print(result);
    }
}
