package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N14581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1 && j==1)
                    System.out.print(":"+str+":");
                else
                    System.out.print(":fan:");
            }
            System.out.println();
        }
    }
}
