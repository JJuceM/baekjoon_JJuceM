package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N21591 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int lW = Integer.parseInt(st.nextToken());
        int lH = Integer.parseInt(st.nextToken());
        int sW = Integer.parseInt(st.nextToken());
        int sH = Integer.parseInt(st.nextToken());
        if(lW-sW >=2 && lH-sH >=2)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
