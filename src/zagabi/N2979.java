package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[100];
        int min = 101, max = 0, sum = 0;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            min = Math.min(min, s);
            max = Math.max(max, e);
            for (int j = s; j < e; j++)
                arr[j]++;
        }
        for(int i=min;i<max;i++){
            if(arr[i]==1)
                sum+=A*arr[i];
            else if(arr[i]==2)
                sum+=B*arr[i];
            else if(arr[i]==3)
                sum+=C*arr[i];
        }
        System.out.println(sum);
    }
}
