package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N16171 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String sch = "";
        String result = br.readLine();
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)-'0' >= 0 && str.charAt(i)-'0'<=9))
                sch +=str.charAt(i);
        }
        if(sch.indexOf(result)!= -1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
