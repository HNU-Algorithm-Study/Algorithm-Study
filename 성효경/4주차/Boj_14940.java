import java.io.*;
import java.util.*;

public class Boj_14940 {

    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static int n, m;
    private static int[][] arr;
    private static boolean[][] visited;
    private static Doot start;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] == 2) {
                    start = new Doot(j, i);
                }
            }
        }

        bfs();

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.printf(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void bfs() {

        Queue<Doot> q = new LinkedList<>();
        arr[start.x][start.y] = 0;
        visited[start.x][start.y] = true;
        q.add(start);

        while (!q.isEmpty()) {

            Doot now = q.poll();

            for (int i=0; i<4; i++) {

                int gx = now.x + dx[i];
                int gy = now.y + dy[i];

                if (gx<0 || gy<0 || gx>=n || gy>=m) {
                    continue;
                }
                if (arr[gx][gy]!=0 && !visited[gx][gy]) {
                    arr[gx][gy] = arr[now.x][now.y]+1;
                    visited[gx][gy] = true;
                    q.add(new Doot(gx, gy));
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {

                if (!visited[i][j] && arr[i][j]==1) {
                    arr[i][j] = -1;
                    visited[i][j] = true;
                }
            }
        }
    }
}

class Doot {

    int x;
    int y;

    Doot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}