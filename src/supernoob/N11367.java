package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N11367 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String grade ="";
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            if(score>=97)
                grade = "A+";
            else if(score >= 90)
                grade = "A";
            else if(score >= 87)
                grade = "B+";
            else if(score >=80)
                grade = "B";
            else if(score >=77)
                grade = "C+";
            else if(score >=70)
                grade = "C";
            else if(score >=67)
                grade = "D+";
            else if(score >=60)
                grade = "D";
            else
                grade = "F";
            System.out.println(name+" "+grade);
        }


    }
}
