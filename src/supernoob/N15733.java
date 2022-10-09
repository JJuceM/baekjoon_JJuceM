package supernoob;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class N15733 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("I'm Sexy");
        bw.flush();
        bw.close();
    }
}
