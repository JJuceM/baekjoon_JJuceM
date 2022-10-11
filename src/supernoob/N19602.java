package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N19602 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        for(int i=1;i<=3;i++){
            int N = Integer.parseInt(br.readLine());
            sum+=i*N;
        }
        if(sum>=10)
            System.out.println("happy");
        else
            System.out.println("sad");
    }
}
