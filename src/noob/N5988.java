package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String [] arr = br.readLine().split("");
            if(Integer.parseInt(arr[arr.length-1])%2==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
