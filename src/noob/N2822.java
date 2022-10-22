package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[8];
        int [] result = new int[8];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
            result[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i=7;i>2;i--){
            sum+=arr[i];
        }
        System.out.println(sum);
        for(int i=0;i<arr.length;i++){
            for(int j=3;j<arr.length;j++){
                if(result[i]==arr[j])
                    System.out.print((i+1)+" ");
            }
        }
    }
}
