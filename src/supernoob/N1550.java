package supernoob;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class N1550 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int result = Integer.parseInt(st.nextToken(),16);

        System.out.println(result);
    }
}
