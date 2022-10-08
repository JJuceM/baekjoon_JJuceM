package supernoob;

import java.io.*;

public class N14038 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            String str = br.readLine();
            if (str.equals("W")) {
                cnt++;
            }
        }
        if (cnt >= 5)
            bw.write("1");
        else if (cnt >= 3)
            bw.write("2");
        else if (cnt >= 1)
            bw.write("3");
        else
            bw.write("-1");

        bw.flush();
        bw.close();

    }
}
