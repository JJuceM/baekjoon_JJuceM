package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 개선한 코드
public class N3004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 2;
        int cnt = 2;
        int N = Integer.parseInt(br.readLine());
        //2 4 6 9 12 16 20 25 30 36
        for(int i=2;i<=N;i++){
            sum+=cnt;
            if(i%2==1)
                cnt++;
        }
        System.out.println(sum);
    }
}

// 처음 만든 코드
/*
import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 2;
        int cnt = 2;
        int N = Integer.parseInt(br.readLine());
        //2 4 6 9 12 16 20 25 30 36
        for (int i = 0; i < N; i++) {
            if(i<4 && i%3!=2){
                sum = sum + cnt;
            }
            else if(i>=4 && i%2!=0){
                sum = sum+cnt;
            }
            else {
                cnt++;
                sum = sum+cnt;
            }
        }
        System.out.println(sum-cnt);
    }
}
*/
