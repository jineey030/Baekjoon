import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class DogTest {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("|\\_/|"+'\n');
        bw.write("|q p|   /}"+'\n');
        bw.write("( 0 )\"\"\"\\"+'\n');
        bw.write("|\"^\"`    |"+'\n');
        bw.write("||_/=\\\\__|"+'\n');

        bw.flush();
        bw.close();
    }
}