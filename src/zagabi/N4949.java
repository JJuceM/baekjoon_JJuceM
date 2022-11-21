package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while(true){
            str = br.readLine();
            if(str.equals("."))
                break;
            System.out.println(isPair(str));
        }
    }
    public static String isPair(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='[')
                stack.push(ch);
            else if(ch==')'){
                if(stack.empty() || stack.peek()!='(')
                    return "no";
                else
                    stack.pop();
            }
            else if(ch==']'){
                if(stack.empty() || stack.peek()!='[')
                    return "no";
                else
                    stack.pop();
            }
        }
        if(stack.empty())
            return "yes";
        else
            return "no";
    }
}
