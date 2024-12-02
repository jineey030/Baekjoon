import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Seven {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int n = 9;
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        Arrays.sort(nums);

        int a = 0;
        int b = 0;

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(sum - nums[i] - nums[j] == 100){
                    a = i;
                    b = j;

                    break;
                } 
            }
        }

        for(int i : nums){
            if( i != nums[a] && i != nums[b]){
                System.out.println(i);
            }
        }

    }
}
