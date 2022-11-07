package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N23972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long K = Long.parseLong(st.nextToken());
        Long N = Long.parseLong(st.nextToken());
        Long re = -1L;
        if(N!= 1L){
            re = (K*N)/(N-1L);
            if((K*N)%(N-1L)!=0L)
                re += 1L;
        }
        System.out.println(re);
    }
}
