package 알고리즘3주차;

import java.io.*;
import java.util.*;
public class boj_11724 {
    private  static int[][] graph;
    private  static boolean[] visit;
    private  static StringTokenizer st;
    private  static BufferedReader br;
    private  static int n;
    private  static int count = 0;
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        int tk = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph= new int[n+1][n+1];
        putGraph(m);

        visit = new boolean[n+1];
        for(int i=1; i<=n; i++){
            if(!visit[i]){
                BFS(i);
                count++;
            }

        }

        System.out.println(count);
    }

    // 인접 행렬을 통해 그래프 생성
    public static void putGraph(int m) throws IOException{

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int firstNode = Integer.parseInt(st.nextToken());
            int secNode = Integer.parseInt(st.nextToken());

            graph[firstNode][secNode] = 1;
            graph[secNode][firstNode] = 1;
        }
    }

    public static  void BFS(int node){
        visit[node] = true;

        Queue<Integer> queue = new LinkedList();
        queue.offer(node);


        while(!queue.isEmpty()){
            int pn = queue.poll();


            for(int i=0; i<=n; i++){
                if(graph[pn][i] ==1 && !visit[i]){
                    visit[i] = true;


                    queue.offer(i);
                }
            }
        }
    }
}
