package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N5054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int [] arr = new int[N];
            int sum = 0;
            for (int j = 0; j < N; j++)
                arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            for(int j=N-1;j>0;j--)
                    sum = sum + (arr[j]-arr[j-1]);
            System.out.println(sum + arr[arr.length-1]-arr[0]);
        }
    }
}
