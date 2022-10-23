package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[5];
        int max = 0;
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<4;j++){
                arr[i] +=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                System.out.println((i+1)+" "+max);
                break;
            }

        }
    }
}
