package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T == 0)
                break;
            if(T%N==0)
                System.out.println(T+" is a multiple of "+N+".");
            else
                System.out.println(T+" is NOT a multiple of "+N+".");
        }
    }
}
