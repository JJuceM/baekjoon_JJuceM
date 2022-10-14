package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())*8;
        int M = Integer.parseInt(br.readLine())*3;
        if(N+M-28 < 0)
            System.out.println(0);
        else
            System.out.println(N+M-28);
    }
}
