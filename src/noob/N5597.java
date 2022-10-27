package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        for (int i = 1; i < 29; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        for (int i = 1;i<arr.length; i++) {
            if(arr[i]!=1)
                System.out.println(i);
        }
    }
}
