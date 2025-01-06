import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class TwoSticker {
    static int h, w, n;
    static Sticker[] stickers;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        stickers = new Sticker[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());

            int Ri = Integer.parseInt(st.nextToken());
            int Ci = Integer.parseInt(st.nextToken());

            stickers[i] = new Sticker(Ri, Ci);
        }

        oneSticker();
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    static class Sticker {
        int h, w;

        public Sticker(int Ri, int Ci){
            this.h = Ri;
            this.w = Ci;
        }
    }

    public static void oneSticker(){
        for(int i=0; i<n; i++){
            Sticker sticker = stickers[i];
            
            int Ri = sticker.h;
            int Ci = sticker.w;

            //기본 모양
            if(h >= Ri && w >= Ci) {
                twoSticker(h-Ri, w-Ci, i+1, Ri*Ci);
            }

            //90도 회전
            if(h >= Ci && w >= Ri){
                twoSticker(h-Ci, w-Ri, i+1, Ri*Ci);
            }
        }
    }

    public static void twoSticker(int newRi, int newCi, int idx, int size){
        for(int i = idx; i<n; i++){
            Sticker sticker = stickers[i];
            
            int Ri = sticker.h;
            int Ci = sticker.w;

            //기본 모양
            if((Ri <= newRi && Ci <= w) || (Ri <= h && Ci <= newCi)) {
                result = Math.max(result, size + Ri * Ci);
            }

            //90도 회전
            Ri = sticker.w;
            Ci = sticker.h;
            if((Ri <= newRi && Ci <= w) || (Ri <= h && Ci <= newCi)) {
                result = Math.max(result, size + Ri * Ci);
            }
        }
    }

}
