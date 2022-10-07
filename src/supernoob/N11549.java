package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11549 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int answer = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] arr=new int [5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]==answer)
                cnt++;
        }
        System.out.println(cnt);
    }
}
