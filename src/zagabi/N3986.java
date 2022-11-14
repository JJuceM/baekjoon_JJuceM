package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N3986 {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        cnt=0;
        for(int i=0;i<N;i++){
            String str = br.readLine();
            goodWord(str);
        }
        System.out.println(cnt);
    }
    public static void goodWord(String str){
        Stack<Character>word = new Stack<>();
        if(str.length()%2==1)
            return;
        word.push(str.charAt(0));
        for(int i=1;i<str.length();i++){
            if(word.size()>0 && word.peek() == str.charAt(i))
                word.pop();
            else
                word.push(str.charAt(i));
        }
        if(word.isEmpty())
            cnt++;
    }
}
