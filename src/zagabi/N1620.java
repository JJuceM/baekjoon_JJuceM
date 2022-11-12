package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap <String,Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        for(int i=1;i<=N;i++){
            String str = br.readLine();
            map.put(str,i);
            arr[i] = str;
        }
        for(int i=0;i<M;i++){
            String str = br.readLine();
            if(isNum(str)){
                sb.append(arr[Integer.parseInt(str)]);
            }
            else{
                sb.append(map.get(str));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    public static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
