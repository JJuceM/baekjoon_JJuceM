package noob;

import java.io.IOException;

public class N15596 {
    public static void main(String[] args) throws IOException {

    }
    public class Test {
        long sum(int[] a) {
            long ans = 0;
            for(int i=0;i<a.length;i++){
                ans += a[i];
            }
            return ans;
        }
    }
}
