package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int [] arr = new int[26];
        String answer ="";
        for(int i=0;i<str.length();i++){
            int index =str.charAt(i)-'A';
            arr[index]++;
        }
        int isOne = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0)
                isOne++;
        }
        StringBuilder sb = new StringBuilder();
        if(isOne>1)
            System.out.println("I'm Sorry Hansoo");
        else {
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i]/2;j++){
                    sb.append((char) (i+65));
                }
            }
            answer += sb.toString();
            String end = sb.reverse().toString();
            sb = new StringBuilder();
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==1){
                    sb.append((char) (i+65));
                }
            }
            answer +=sb.toString()+end;
        }
        System.out.println(answer);
    }
}
