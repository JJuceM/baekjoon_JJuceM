package supernoob;

import java.io.IOException;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class N16170 {
    public static void main(String[] args) throws IOException {
        LocalDate date = LocalDate.now();
        StringTokenizer st = new StringTokenizer(date.toString(),"-");
        for(int i=st.countTokens();i>0;i--){
            System.out.println(st.nextToken());
        }
    }
}
