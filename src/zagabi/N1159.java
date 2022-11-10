package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[26];
        boolean bo = false;
        for(int i=0;i<N;i++){
            arr[(br.readLine().charAt(0)-'a')]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=5){
                System.out.print((char)(i+'a'));
                bo = true;
            }
        }
        if(bo==false){
            System.out.println("PREDAJA");
        }
    }
}
