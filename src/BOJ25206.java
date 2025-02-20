import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class BOJ25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double totalCredits = 0.0;
        double totalPoints = 0.0;

        double[] gradePoints = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        String[] gradeLetters = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); 
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) {
                continue;
            }

            for (int j = 0; j < gradeLetters.length; j++) {
                if (grade.equals(gradeLetters[j])) {
                    totalCredits += credit;
                    totalPoints += credit * gradePoints[j];
                    break;
                }
            }
        }

        double majorGPA = totalPoints / totalCredits;
        
        bw.write(String.format("%.6f", majorGPA));
        bw.flush();
        bw.close();
        br.close();
    }
}
