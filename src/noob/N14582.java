package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean bo = false;
        int sumJe = 0, sumSta = 0;
        int[] je = new int[9];
        for (int i = 0; i < je.length; i++) {
            je[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] sta = new int[9];
        for (int i = 0; i < sta.length; i++) {
            sta[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < sta.length; i++) {
            sumJe += je[i];
            if (sumJe > sumSta)
                bo = true;
            sumSta += sta[i];
            if (sumJe > sumSta)
                bo = true;
        }
        if (bo)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
