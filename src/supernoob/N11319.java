package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11319 {
    public static void main(String[] args)throws IOException{
        char [] arr = {'A','E','I','O','U','a','e','i','o','u'};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String str = br.readLine();
            int mo=0;
            int ja=0;
            for(int j = 0; j<str.length();j++){
                for(int k=0;k<arr.length;k++){
                    if(str.charAt(j)==arr[k]){
                        mo++;
                    }
                }
            }
            String newStr = str.replaceAll(" ","");
            ja = newStr.length()-mo;
            System.out.println(ja+" "+mo);

        }
    }
}
