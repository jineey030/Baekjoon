import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BirthdayTest {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, ArrayList<String>> bday = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            String name = str.nextToken();
            String day = str.nextToken();
            String month = str.nextToken();
            String year = str.nextToken();

            if(day.length() == 1){
                day = "0"+day;
            }

            //name에 해당하는 ArrayList가 없으면 생성하고, 있으면 가져오기
            bday.computeIfAbsent(name, k -> new ArrayList<>()).add(year);
            bday.computeIfAbsent(name, k -> new ArrayList<>()).add(month);
            bday.computeIfAbsent(name, k -> new ArrayList<>()).add(day); 
        }

        ArrayList<String> arrName = new ArrayList<String>(bday.keySet());
        String[] answer = new String[2];

        for(String name : arrName){
            if(answer[0] == null || answer[1] == null){
                answer[0] = name;
                answer[1] = name;
            } 

            //나이가 가장 적은 사람
            ArrayList<String> birth = bday.get(name);
            ArrayList<String> young = bday.get(answer[0]);

            // 생년월일 비교 (년, 월, 일 순서로 비교)
            if(Integer.parseInt(birth.get(0)) > Integer.parseInt(young.get(0)) || 
               (Integer.parseInt(birth.get(0)) == Integer.parseInt(young.get(0)) && Integer.parseInt(birth.get(1)) > Integer.parseInt(young.get(1))) || 
               (Integer.parseInt(birth.get(0)) == Integer.parseInt(young.get(0)) && Integer.parseInt(birth.get(1)) == Integer.parseInt(young.get(1)) && Integer.parseInt(birth.get(2)) > Integer.parseInt(young.get(2)))) {
                answer[0] = name;
            }

            //나이가 가장 많은 사람
            ArrayList<String> old = bday.get(answer[1]);

            if(Integer.parseInt(birth.get(0)) < Integer.parseInt(old.get(0)) || 
               (Integer.parseInt(birth.get(0)) == Integer.parseInt(old.get(0)) && Integer.parseInt(birth.get(1)) < Integer.parseInt(old.get(1))) || 
               (Integer.parseInt(birth.get(0)) == Integer.parseInt(old.get(0)) && Integer.parseInt(birth.get(1)) == Integer.parseInt(old.get(1)) && Integer.parseInt(birth.get(2)) < Integer.parseInt(old.get(2)))) {
                answer[1] = name;
            }

        }

        for(String name : answer){
            System.out.println(name);
        }

    }
}
