import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class BOJ14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] arr = new int[3];

        for(int i=0; i<3; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) {
            arr[2] = arr[0] + arr[1] - 1;
        }

        System.out.print(arr[0]+arr[1]+arr[2]);
    }
}