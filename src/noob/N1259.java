package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            sb.setLength(0);
            if(str.equals("0"))
                break;
            for(int i=str.length()-1;i>=0;i--){
                sb.append(str.charAt(i));
            }
            if(str.equals(sb.toString()))
                System.out.println("yes");
            else
                System.out.println("no");
        }

    }
}
