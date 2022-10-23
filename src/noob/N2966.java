package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N2966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Adrian = "ABC";
        String Bruno = "BABC";
        String Goran = "CCAABB";
        int [] arr = new int[3];
        int max = 0;
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        while(Adrian.length()<N || Bruno.length()<N || Goran.length()<N){
            Adrian = Adrian+Adrian;
            Bruno = Bruno+Bruno;
            Goran = Goran+Goran;
        }
        for(int i = 0;i<N;i++){
            if(Adrian.charAt(i)==str.charAt(i))
                arr[0]++;
            if(Bruno.charAt(i)==str.charAt(i))
                arr[1]++;
            if(Goran.charAt(i)==str.charAt(i))
                arr[2]++;
        }
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println(max);
        for(int i=0;i<arr.length;i++){
            if(max==arr[i]){
                if(i==0)
                    System.out.println("Adrian");
                else if(i==1)
                    System.out.println("Bruno");
                else
                    System.out.println("Goran");
            }
        }

    }
}
