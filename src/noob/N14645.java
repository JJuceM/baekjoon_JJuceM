package noob;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class N14645 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("비와이");
        bw.flush();
        bw.close();
    }
}
