package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  //스크린
        int m = Integer.parseInt(st.nextToken());  //바구니 크기
        int apple = Integer.parseInt(br.readLine());  //사과 개수

        int left = 1;  //바구니 왼쪽 좌표
        int right = m;  //바구니 오른쪽 좌표
        int sum = 0;  //이동 거리

        for(int i = 0; i < apple; i++) {
            int where = Integer.parseInt(br.readLine());

            //바구니 안에 떨어지는 경우
            if(left <= where && where <= right) {
                continue;
            }

            //바구니 왼쪽에 가깝게 떨어지는 경우
            if(left > where) {
                sum += (left - where);
                right -= (left - where);
                left = where;
            }

            //바구니 오른쪽에 가깝게 떨어지는 경우
            else{
                sum += (where - right);
                left += (where - right);
                right = where;
            }
        }

        System.out.println(sum);

    }
}
