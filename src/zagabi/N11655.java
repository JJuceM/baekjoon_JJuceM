package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char [] ch = br.readLine().toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]>='N')
                    ch[i]-=13;
                else
                    ch[i]+=13;
            }
            else if(ch[i]>='a' && ch[i] <= 'z')
                if(ch[i]>='n')
                    ch[i]-=13;
                else
                    ch[i]+=13;
        }
        for(int i=0; i<ch.length;i++){
            sb.append(ch[i]);
        }
        System.out.println(sb);
    }
}
