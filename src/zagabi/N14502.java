package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class N14502 {
    static class virus {
        int x, y;

        virus(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int N;
    static int M;
    static int[][] map;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        DFS(0);
        System.out.println(result);

    }

    public static void DFS(int depth) {
        if (depth == 3) {
            BFS();
            return;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    DFS(depth + 1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void BFS() {
        int[][] virusMap = new int[N][M];
        Queue<virus> que = new LinkedList<virus>();
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                virusMap[i][j] = map[i][j];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                if (virusMap[i][j] == 2)
                    que.add(new virus(i, j));
        while (!que.isEmpty()) {
            virus v = que.remove();
            for (int d = 0; d < 4; d++) {
                int nr = v.x + dr[d];
                int nc = v.y + dc[d];
                if (nr >= 0 && nc >= 0 && nr < N && nc < M) {
                    if (virusMap[nr][nc] == 0) {
                        virusMap[nr][nc] = 2;
                        que.add(new virus(nr, nc));
                    }
                }
            }
        }
        safe(virusMap);
    }

    public static void safe(int[][] virusMap) {
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (virusMap[i][j] == 0)
                    cnt++;
            }
        }
        result = Math.max(cnt, result);
    }
}
