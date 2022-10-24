package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] arr = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A')
                System.out.print(arr[0]+" ");
            else if(str.charAt(i)=='B')
                System.out.print(arr[1]+" ");
            else
                System.out.print(arr[2]+" ");
        }
    }
}
