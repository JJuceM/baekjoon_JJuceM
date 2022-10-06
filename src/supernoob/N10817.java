package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10817 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A>B){
            if(B>C){
                System.out.println(B);
            }
            else if(A>C)
                System.out.println(C);
            else
                System.out.println(A);
        }
        else{
            if(A>C)
                System.out.println(A);
            else if(B>C)
                System.out.println(C);
            else
                System.out.println(B);
        }
    }
}
