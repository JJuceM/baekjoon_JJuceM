package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;
        for(int i=0;i<5;i++){
            int cnt = Integer.parseInt(br.readLine());
            sum+=cnt;
        }
        System.out.println(sum);
    }
}
