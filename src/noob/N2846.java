package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2846 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] oh = new int[N];
        int j=0,max=0;
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                oh[j]+=arr[i+1]-arr[i];
            }
            else{
                j++;
            }
        }
        for(int i=0;i<oh.length;i++){
            if(max<oh[i])
                max=oh[i];
        }
        if(max!=0)
            System.out.println(max);
        else
            System.out.println(0);
    }
}
