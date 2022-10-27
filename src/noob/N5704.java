package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int [] arr = new int[26];
            String str = br.readLine().replace(" ","");
            if(str.equals("*"))
                break;
            for(int i=0;i<str.length();i++){
                arr[str.charAt(i)-97]++;
            }
            String result = "Y";
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    result="N";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
