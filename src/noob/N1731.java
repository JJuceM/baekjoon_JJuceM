package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1731 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(br.readLine());
        if(arr[2]-arr[1] == arr[1]-arr[0])
            System.out.println(arr[arr.length-1]+(arr[1]-arr[0]));
        else
            System.out.println(arr[arr.length-1]*(arr[1]/arr[0]));
    }
}
