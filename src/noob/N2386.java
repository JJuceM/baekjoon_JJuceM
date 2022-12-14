package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String [] arr = new String[st.countTokens()];
            int cnt = 0;

            for(int i=0;i<arr.length;i++)
                arr[i] = st.nextToken().toLowerCase();
            if(arr[0].equals("#"))
                break;

            for(int i=1;i<arr.length;i++){
                for(int j=0;j<arr[i].length();j++){
                    if(arr[0].charAt(0)==(arr[i].charAt(j))){
                        cnt++;
                    }
                }
            }
            System.out.println(arr[0]+" "+cnt);
        }
    }
}
