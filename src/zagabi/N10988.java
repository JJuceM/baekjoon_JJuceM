package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--){
            str2+=str.charAt(i);
        }
        if(str2.equals(str))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
