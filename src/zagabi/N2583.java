package zagabi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class N2583 {
    static int M;
    static int N;
    static int K;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int[][] map;
    static int cnt=0;
    static ArrayList<Integer> List;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for(int j = y1;j<y2;j++){
                for(int k=x1;k<x2;k++)
                    map[j][k]=1;
            }
        }
        List = new ArrayList<>();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(map[i][j]==0){
                    cnt=0;
                    dfs(i,j);
                    List.add(cnt);
                }
            }
        }
        System.out.println(List.size());
        Collections.sort(List);
        for(Integer result:List)
            System.out.print(result+" ");
    }
    public static void dfs(int r, int c){
        map[r][c]=1;
        cnt++;
        for(int i=0;i<4;i++){
            int nr = r + dr[i];
            int nc = c+dc[i];
            if(nr>=0 && nc>=0 && nr<M && nc<N)
                if(map[nr][nc]==0)
                    dfs(nr,nc);
        }
    }
}
