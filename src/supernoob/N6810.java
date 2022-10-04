package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8};
        int sum = 0;
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                sum += arr[i] * 1;
            else
                sum += arr[i] * 3;
        }
        System.out.println("The 1-3-sum is " + (sum + A + (B * 3) + C));

    }
}
