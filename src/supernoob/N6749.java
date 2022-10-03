package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y1 = Integer.parseInt(br.readLine());
        int y2 = Integer.parseInt(br.readLine());
        System.out.println(y2+(y2-y1));
    }
}
