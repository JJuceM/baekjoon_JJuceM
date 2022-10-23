package noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 다시 풀어봐야할 문제
public class N3035 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rz = br.readLine().split(" ");
        String result = "";

        for(int i=0; i<Integer.parseInt(rz[0]); i++) {
            String[] str = br.readLine().split("");
            String saveWord = "";
            for(String alpha:str) {
                for(int z=0; z<Integer.parseInt(rz[3]); z++) {
                    saveWord += alpha;
                }
            }
            for(int j=0; j<Integer.parseInt(rz[2]); j++) {
                result += saveWord+"\n";
            }
        }
        System.out.println(result);
    }
}
