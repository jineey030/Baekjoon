import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MarriedTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        HashMap<Integer, HashSet<Integer>> friends = new HashMap<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            friends.putIfAbsent(a, new HashSet<>());
            friends.putIfAbsent(b, new HashSet<>());
            friends.get(a).add(b);
            friends.get(b).add(a);
        }

        HashSet<Integer> invitees = new HashSet<>();

        if (friends.containsKey(1)) {
            for (int friend : friends.get(1)) {
                invitees.add(friend);

                if (friends.containsKey(friend)) {
                    for (int friendsFriend : friends.get(friend)) {
                        if (friendsFriend != 1) {
                            invitees.add(friendsFriend);
                        }
                    }
                }
            }
        }

        bw.write(String.valueOf(invitees.size()));
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}
