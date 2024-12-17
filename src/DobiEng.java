import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class DobiEng {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                int num = Integer.parseInt(br.readLine());  

                if (num == 0) {
                    break;  
                }

                String[] list = new String[num];
                for (int i = 0; i < num; i++) {
                    list[i] = br.readLine();  
                }

                Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

                bw.write(list[0] + "\n");
            }

            bw.flush();  

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
