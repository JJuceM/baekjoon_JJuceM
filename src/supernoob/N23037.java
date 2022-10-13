package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N23037 {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int sum=0;
       int N = Integer.parseInt(br.readLine());
       int M = 0;
       for(int i=0;i<5;i++){
           M = N%10;
           sum += M*M*M*M*M;
           N/=10;
       }
        System.out.println(sum);
    }
}
