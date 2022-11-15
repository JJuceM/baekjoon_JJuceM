package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N1012 {
    static int ground [][];
    static boolean check [][];
    static int weight;
    static int height;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            weight = Integer.parseInt(st.nextToken());
            height = Integer.parseInt(st.nextToken());
            ground = new int[weight][height];
            check = new boolean[weight][height];
            int K = Integer.parseInt(st.nextToken());
            for(int j=0;j<K;j++){
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                ground[X][Y] = 1;
            }
            int cnt = 0;
            for(int j=0;j<weight;j++){
                for(int k=0;k<height;k++){
                    if(ground[j][k]==1 && !check[j][k]){
                        dfs(j,k);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    public static void dfs(int startX,int startY){
        check[startX][startY]=true;
        int[] X = {0, 0, -1, +1};
        int[] Y = {-1, +1, 0, 0};
        for(int i=0;i<4;i++){
            int x = startX + X[i];
            int y = startY + Y[i];
            if(x<0||x>=weight||y<0||y>=height)
                continue;
            if(ground[x][y] == 1 && !check[x][y])
                dfs(x,y);
        }
    }
}
