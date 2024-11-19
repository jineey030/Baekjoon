import java.io.*;
import java.util.*;

public class Company {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        HashSet<String> mapList = new HashSet<>();

        for(int i=0; i < num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String commute = st.nextToken();

            if(commute.equals("leave")){
                mapList.remove(name);
            } else {
                mapList.add(name);
            }
        }

        ArrayList<String> list = new ArrayList<String>(mapList);
        Collections.sort(list);

        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }

    }
}
