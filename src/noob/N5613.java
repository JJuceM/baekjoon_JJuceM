package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        while(true){
            String str = br.readLine();
            if(str.equals("="))
                break;
            int N = Integer.parseInt(br.readLine());

            if(str.equals("+"))
                sum += N;
            else if(str.equals("-"))
                sum -= N;
            else if(str.equals("*"))
                sum *= N;
            else if(str.equals("/"))
                sum /= N;
        }
        System.out.println(sum);
    }
}
