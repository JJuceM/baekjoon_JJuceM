package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N23825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = (Integer.parseInt(st.nextToken()));
        int M = (Integer.parseInt(st.nextToken()));
        System.out.println(Math.min(N/2,M/2));
    }
}
