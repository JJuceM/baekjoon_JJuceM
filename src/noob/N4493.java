package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int cnt1 = 0;
            int cnt2 = 0;
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String p1 = st.nextToken();
                String p2 = st.nextToken();
                if(p1.equals("R") && p2.equals("S"))
                    cnt1++;
                else if(p1.equals("R") && p2.equals("P"))
                    cnt2++;
                else if(p1.equals("S") && p2.equals("P"))
                    cnt1++;
                else if(p1.equals("S") && p2.equals("R"))
                    cnt2++;
                else if(p1.equals("P") && p2.equals("R"))
                    cnt1++;
                else if(p1.equals("P") && p2.equals("S"))
                    cnt2++;
            }
            if(cnt1>cnt2)
                System.out.println("Player 1");
            else if(cnt1<cnt2)
                System.out.println("Player 2");
            else
                System.out.println("TIE");
        }
    }
}
