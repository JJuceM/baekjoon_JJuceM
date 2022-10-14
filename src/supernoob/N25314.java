package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=N;i>0;i-=4)
            System.out.print("long ");
        System.out.println("int");
    }
}
