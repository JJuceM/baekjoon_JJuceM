package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class N9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            int N = Integer.parseInt(br.readLine());
            int cnt = N;
            HashMap<String,Integer>map = new HashMap<>();
            for(int j=0;j<N;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                String str1 = st.nextToken();
                map.put(str1,map.getOrDefault(str1,0)+1);
            }
            int ans = 1;
            for(int val : map.values())
                ans *= val+1;
            System.out.println(ans-1);
        }
    }
}
