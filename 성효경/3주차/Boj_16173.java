import java.io.*;
import java.util.*;

public class Boj_16173 {

    static int n;

    static boolean[][] visited;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n+1][n+1];
        arr = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=1; j<=n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }

        System.out.println(dfs() ? "HaruHaru" : "Hing");
    }

    public static boolean dfs() {

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{1, 1});
        visited[1][1] = true;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];
            int jump = arr[x][y];

            if (jump == -1) {
                return true;
            }

            if (x + jump <= n && !visited[x+jump][y]) {
                visited[x+jump][y] = true;
                stack.push(new int[]{x+jump, y});
            }
            if (y + jump <= n && !visited[x][y+jump]) {
                visited[x][y+jump] = true;
                stack.push(new int[]{x, y+jump});
            }
        }
        return false;
    }
}