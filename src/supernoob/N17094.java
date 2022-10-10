package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt2=0,cntE=0;
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='2'){
                cnt2++;
            }
            else
                cntE++;
        }
        if(cnt2==cntE)
            System.out.println("yee");
        else if(cnt2>cntE)
            System.out.println("2");
        else
            System.out.println("e");
    }
}
