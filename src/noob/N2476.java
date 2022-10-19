package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] answer = new int[N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int [] arr = new int[st.countTokens()];
            int max = 0;
            for(int j=0;j<3;j++)
                arr[j] = Integer.parseInt(st.nextToken());
            if(arr[0]==arr[1] && arr[0]==arr[2])
                answer[i] = 10000 + arr[0]*1000;

            else if(arr[0]==arr[1] && arr[0]!=arr[2])
                answer[i] = 1000 + arr[0]*100;
            else if(arr[0]==arr[2] && arr[0] !=arr[1])
                answer[i] = 1000+ arr[0]*100;
            else if(arr[1]==arr[2] && arr[1]!=arr[0])
                answer[i] = 1000 + arr[1]*100;
            else{
                for(int k=0;k<3;k++){
                    if(max < arr[k])
                        max=arr[k];
                }
                answer[i] = max*100;
            }
        }
        int max = 0;
        for(int i = 0;i<answer.length;i++){
            if(max < answer[i])
                max = answer[i];
        }
        System.out.println(max);

    }
}
