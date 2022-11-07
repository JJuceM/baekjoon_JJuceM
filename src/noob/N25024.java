package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N25024 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String str, str2;
        String[] arr1 = {"4","6","9","11"};
        String[] arr2= {"1","3","5","7","8","10","12"};
        for(int i=0;i<T;i++) {
            str=str2="No";
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(0<=a&&a<=23&&0<=b&&b<=59) str="Yes";
            if(1<=a&&a<=12&&b>=1){
                if(a==2&&b<=29)str2="Yes";
                else if(Arrays.asList(arr1).contains(String.valueOf(a))&&b<=30)str2="Yes";
                else if(Arrays.asList(arr2).contains(String.valueOf(a))&&b<=31)str2="Yes";
            }
            System.out.println(str+" "+str2);
        }
    }
}
