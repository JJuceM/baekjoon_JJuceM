package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[4];
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] == 0)
                    cnt++;
            }
            if(cnt==1)
                System.out.println("A");
            else if(cnt==2)
                System.out.println("B");
            else if(cnt==3)
                System.out.println("C");
            else if(cnt==4)
                System.out.println("D");
            else
                System.out.println("E");

        }
    }
}
