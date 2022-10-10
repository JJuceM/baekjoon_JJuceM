package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N17010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0;j<C;j++){
                System.out.print(str);
            }
            System.out.println();
        }

    }
}
