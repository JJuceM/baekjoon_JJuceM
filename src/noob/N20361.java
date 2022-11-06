package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class N20361 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int cupCnt = Integer.parseInt(st.nextToken());
        int cupIdx = Integer.parseInt(st.nextToken());
        int movCnt = Integer.parseInt(st.nextToken());

        for (int idx = 0; idx < movCnt; idx++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            final int prevCupIdx = cupIdx;

            if(a == prevCupIdx){
                cupIdx = b;
            } else if(b == prevCupIdx){
                cupIdx = a;
            }
        }
        System.out.print(cupIdx);
    }
}