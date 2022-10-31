package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        int sum=0;
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum>T){
                sum = sum - arr[i];
                break;
            }
            else
                cnt++;
        }
        System.out.println(cnt);
    }
}
