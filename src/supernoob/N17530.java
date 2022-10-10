package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N17530 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max=0;
        int N = Integer.parseInt(br.readLine());
        int [] arr= new int[N];
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        if(max == arr[0])
            System.out.println("S");
        else
            System.out.println("N");
    }
}
