package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [N];
        String [] str = new String[N];
        int min = 4;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            str[i] = st.nextToken();
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]<=min)
                min=arr[i];
        }
        for(int i=0;i<N;i++){
            if(arr[i]==min)
                System.out.println(str[i]);
        }

    }
}
