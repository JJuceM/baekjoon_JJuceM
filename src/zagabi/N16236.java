package zagabi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class N16236 {
    private static class Fish {
        int x, y, time;

        public Fish(int x, int y, int time) {
            super();
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    static int N;
    static int[][] map;
    static boolean[][] isVisit;

    static Fish shark;
    static int size = 2;
    static int eaten = 0;

    static ArrayList<Fish> feedList = new ArrayList<>();
    static int answer;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);

        map = new int[N][N];
        isVisit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            input = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(input[j]);

                if(map[i][j] == 9) {
                    shark = new Fish(i, j, 0);
                    map[i][j] = 0;
                }
            }
        }

        simulation();
        System.out.println(answer);
    }

    private static void simulation() {

        Queue<Fish> q = new LinkedList<>();
        q.add(shark);
        isVisit[shark.x][shark.y] = true;

        while(true) {
            while(!q.isEmpty()) {
                Fish now = q.poll();
                int time = now.time;


                for (int k = 0; k < 4; k++) {
                    int nx = now.x + dx[k];
                    int ny = now.y + dy[k];

                    if(!(0 <= nx && nx < N && 0 <= ny && ny < N) || isVisit[nx][ny]) continue;

                    if(map[nx][ny] < size && map[nx][ny] != 0) {
                        q.add(new Fish(nx, ny, time+1));
                        isVisit[nx][ny] = true;
                        feedList.add(new Fish(nx, ny, time+1));
                    }

                    if(map[nx][ny] == size || map[nx][ny] == 0) {
                        q.add(new Fish(nx, ny, time+1));
                        isVisit[nx][ny] = true;
                    }
                }
            }

            if(!feedList.isEmpty()) {
                eat();

                q.clear();
                isVisit = new boolean[N][N];

                q.add(shark);
                isVisit[shark.x][shark.y] = true;
            }else {
                return;
            }
        }

    }

    private static void eat() {

        Collections.sort(feedList, new Comparator<Fish>() {
            @Override
            public int compare(Fish o1, Fish o2) {
                if(o1.time == o2.time) {
                    if(o1.x == o2.x) {
                        if(o1.y > o2.y) {
                            return 1;
                        }else {
                            return -1;
                        }
                    }else {
                        if(o1.x > o2.x) {
                            return 1;
                        }else {
                            return -1;
                        }
                    }
                }else if(o1.time > o2.time){
                    return 1;
                }else {
                    return -1;
                }
            };
        });

        Fish now = feedList.get(0);

        shark.x = now.x;
        shark.y = now.y;

        if(++eaten == size) {
            size++;
            eaten = 0;
        }

        answer += now.time;

        map[now.x][now.y] = 0;

        feedList.clear();
    }

}