package supernoob;

import java.io.*;

public class N13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0;i <N;i++){
            int k = Integer.parseInt(br.readLine());
            for(int j=0;j<k;j++){
                bw.write("=");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
