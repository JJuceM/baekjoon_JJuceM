package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N21300 {
    public static void main(String[] args) throws IOException {
        int [] arr = new int[6];
        int sum=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]!=0){
                sum+=arr[i]*5;
            }
        }
        System.out.println(sum);
    }
}
