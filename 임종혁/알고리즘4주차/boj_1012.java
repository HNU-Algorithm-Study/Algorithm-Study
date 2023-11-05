package 알고리즘4주차;

import java.io.*;
import java.util.*;
public class boj_1012 {
    private  static int[] dy = {1,-1,0,0};
    private static int[] dx = {0,0,1,-1};
    private static int[][] graph;
    private static boolean[][] visited;
    private  static  int n;
    private  static  int m;
    private static int count;
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tk = Integer.parseInt(br.readLine());


        for(int i=0; i<tk; i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            count =0;

            graph = new int[n+1][m+1];
            visited = new boolean[n+1][m+1];

            for(int j=0; j<k; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());


                graph[a][b] = 1;
            }


            for(int j=0; j<n+1; j++){
                for(int z=0; z<m+1; z++){
                    if(graph[j][z] ==1){
                        if(!visited[j][z]){
                            count++;
                            bfs(j,z);
                        }
                    }
                }
            }
            System.out.println(count);


        }



    }

    private static void bfs(int x, int y){
        visited[x][y] = true;
        dot dot = new dot(x,y);
        Queue<dot> queue = new LinkedList();
        queue.add(dot);

        while(!queue.isEmpty()){
            dot ndot = queue.poll();
            int nx = ndot.x;
            int ny = ndot.y;

            for(int i=0; i<4; i++){
                int nextX = nx+dx[i];
                int nextY = ny +dy[i];

                if(nextX >=0 && nextX<=n){
                    if(nextY >=0 && nextY<=m) {
                        if(graph[nextX][nextY] ==1 && !visited[nextX][nextY]){
                            visited[nextX][nextY]= true;
                            dot nextDot = new dot(nextX,nextY);
                            queue.add(nextDot);
                        }
                    }
                }
            }
        }

    }

}
class dot{
    int x;
    int y;

    public dot(int x, int y){
        this.x=x;
        this.y = y;
    }
}
