package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N24264 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        System.out.println(N*N);
        System.out.print(2);
    }
}
