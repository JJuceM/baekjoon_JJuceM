package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N2484 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if (a == b && b == c && c == d)
                arr[i] = 50000 + a * 5000;

            else if ((a == b && b == c && a != d) || (a == b && b == d && a != c) || (b == c && c == d && a != b))
                arr[i] = 10000 + b * 1000;
            else if (a == c && c == d && a != b)
                arr[i] = 10000 + a * 1000;

            else if((a==b && a!=c && c==d) || (a==c && a!=b && b==d))
                arr[i] = 2000+a*500 + d*500;
            else if(a==d && a!=b && b==c)
                arr[i] = 2000+a*500+b*500;

            else if ((a == b && a != c && a != d) || (a == c && a != b && a != d) || (a == d && a != b && a != c))
                arr[i] = 1000 + a * 100;
            else if((b==c && b!=a && b!=d) || (b==d && b!=a && b!=c))
                arr[i] = 1000 + b * 100;
            else if(c==d && c!=a && c!=b)
                arr[i] = 1000 + c * 100;

            else{
                int [] answer = {a,b,c,d};
                Arrays.sort(answer);
                arr[i] = answer[3]*100;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[N-1]);
    }
}
