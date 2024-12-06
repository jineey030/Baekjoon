import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BrunchTest {
    // 배열의 인접한 값들을 비교하고 교환 후 출력하는 메서드
    public static void arr(int[] brunchs) {
        int tmp = 0;

        // 첫 번째와 두 번째 비교
        if (brunchs[0] > brunchs[1]) {
            tmp = brunchs[0];
            brunchs[0] = brunchs[1];
            brunchs[1] = tmp;
            print(brunchs);
        }

        // 두 번째와 세 번째 비교
        if (brunchs[1] > brunchs[2]) {
            tmp = brunchs[1];
            brunchs[1] = brunchs[2];
            brunchs[2] = tmp;
            print(brunchs);
        }

        // 세 번째와 네 번째 비교
        if (brunchs[2] > brunchs[3]) {
            tmp = brunchs[2];
            brunchs[2] = brunchs[3];
            brunchs[3] = tmp;
            print(brunchs);
        }

        // 네 번째와 다섯 번째 비교
        if (brunchs[3] > brunchs[4]) {
            tmp = brunchs[3];
            brunchs[3] = brunchs[4];
            brunchs[4] = tmp;
            print(brunchs);
        }
    }

    // 배열을 출력하는 메서드
    public static void print(int[] brunchs) {
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < brunchs.length; k++) {
            sb.append(brunchs[k]);
            if (k < brunchs.length - 1) {
                sb.append(" "); // 마지막 요소에는 공백을 추가하지 않음
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] brunchs = new int[5];

        int i = 0;
        while (st.hasMoreTokens()) {
            brunchs[i++] = Integer.parseInt(st.nextToken());
        }

        // 배열이 정렬될 때까지 반복
        while (true) {
            boolean sorted = true; // 배열이 이미 정렬되었는지 확인
            for (int k = 0; k < 4; k++) {
                if (brunchs[k] > brunchs[k + 1]) {
                    // 교환이 일어나면 다시 정렬해야 하므로 sorted = false로 설정
                    sorted = false;
                    arr(brunchs);
                }
            }
            // 배열이 정렬되었다면 반복 종료
            if (sorted) break;
        }
    }
}
