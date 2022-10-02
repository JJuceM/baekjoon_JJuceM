package supernoob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        for (int i = 0; i < total; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.print("Pairs for " + n + ": ");
            for (int j = 1; j <= n / 2; j++) {
                for (int k = 2; k < n; k++) {
                    if (j + k == n && j < k) {
                        System.out.print(j + " " + k);
                        if (k - 2 > j)
                            System.out.print(", ");
                    }
                }
            }
            System.out.println();
        }
    }

}
// 백준에서 요구하는 테스트 케이스로 풀었을 때
/*import java.util.ArrayList;
        import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> solveSumPairs(int target) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        *//* ------------------- INSERT CODE HERE ---------------------*//*

        // answer.add(x);		// adds x to ArrayList<Integer> answer

        for (int j = 1; j <= target/2; j++) {
            for (int k = 2; k < target; k++) {
                if (j + k == target && j < k) {
                    answer.add(j);
                    answer.add(k);
                }
            }
        }

        *//* -------------------- END OF INSERTION --------------------*//*

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int n = 0; n < numCases; n++)
        {
            int target = sc.nextInt();

            ArrayList<Integer> answer = solveSumPairs(target);

            System.out.print("Pairs for "+target+": ");

            for (int i = 0; i<answer.size(); i+=2 ) {
                if (i>0)
                    System.out.print(", ");
                System.out.print(answer.get(i) + " " + answer.get(i+1));
            }
            System.out.println();
        }
    }
}*/
