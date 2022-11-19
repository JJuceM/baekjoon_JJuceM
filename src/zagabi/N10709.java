package zagabi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N10709 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        char[][] map = new char[H][W];
        int[][] result = new int[H][W];
        String[] input = new String[H];
        for (int i = 0; i < H; i++) {
            input[i] = br.readLine();
            for (int j = 0; j < W; j++) {
                map[i][j] = input[i].charAt(j);
                if (map[i][j] == '.') {
                    result[i][j] = -1;
                }
                if (map[i][j] == 'c') {
                    result[i][j] = 0;

                }
            }
        }
        int cloud = 0;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (result[i][j] == 0) {
                    for (int k = j + 1; k < W; k++) {
                        if (result[i][k] == 0) {
                            cloud = 0;
                            break;
                        } else {
                            cloud += 1;
                            result[i][k] = cloud;
                        }

                    }
                }
            }
            cloud = 0;
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
