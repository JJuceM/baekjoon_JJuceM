package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N16199 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y =- Integer.parseInt(st.nextToken());
        int m =- Integer.parseInt(st.nextToken());
        int d =- Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        y += Integer.parseInt(st.nextToken());
        m += Integer.parseInt(st.nextToken());
        d += Integer.parseInt(st.nextToken());
        if(m>0)
            System.out.println(y);
        else if(m<0)
            System.out.println(y-1);
        else{
            if(d>=0)
                System.out.println(y);
            else
                System.out.println(y-1);
        }
        System.out.println(y+1);
        System.out.println(y);
    }
}
