package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int max = 0;
        int cnt = 0;
        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i])
                max=arr[i];
        }
        for(int i=0;i<9;i++){
            if(max==arr[i]){
                System.out.println(max);
                System.out.println(i+1);
            }
        }

    }
}
