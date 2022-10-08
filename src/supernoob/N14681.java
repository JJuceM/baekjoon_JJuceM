package supernoob;

import java.io.*;

public class N14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if (x > 0 && y > 0)
            bw.write("1");
        else if (x > 0 && y < 0)
            bw.write("4");
        else if (x < 0 && y > 0)
            bw.write("2");
        else
            bw.write("3");
        bw.flush();
        bw.close();
    }
}
