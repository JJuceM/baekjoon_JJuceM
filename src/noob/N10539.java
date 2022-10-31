package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        int [] arr2 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i]*(i+1)-sum;
            sum+=arr2[i];
        }
        for(int i=0;i<arr2.length;i++)
            System.out.print(arr2[i]+ " ");
    }
}
