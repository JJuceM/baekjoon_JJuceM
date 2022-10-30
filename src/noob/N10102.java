package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int Acnt=0,Bcnt=0;
        String str = br.readLine();
        String [] arr = str.split("");

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("A"))
                Acnt++;
            else
                Bcnt++;
        }
        if(Acnt>Bcnt)
            System.out.println("A");
        else if (Acnt<Bcnt)
            System.out.println("B");
        else
            System.out.println("Tie");
    }
}
