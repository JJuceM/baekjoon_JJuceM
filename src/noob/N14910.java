package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N14910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[st.countTokens()];
        int [] arr2 = new int[st.countTokens()];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);
        if(Arrays.equals(arr,arr2)){
            System.out.println("Good");
        }
        else
            System.out.println("Bad");
    }
}
