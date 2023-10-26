import java.io.*;
import java.util.*;

public class Boj_16173 {

    static int n;
    static boolean isPossible = false;

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j=1; j<=n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }

        dfs(1, 1);
        System.out.println(isPossible ? "HaruHaru" : "Hing");
    }

    public static void dfs(int startRaw, int startCul) {

        Stack<Integer> stack = new Stack<>();
        stack.add(arr[startRaw][startCul]);
        int sum = 0;

        while (!stack.empty()) {
            stack.pop();
            for (int i=n; i>=2; i--) {
                stack.add(arr[startRaw][startCul+i]);
            }
        }

        if (isPossible)
            return;

        int x = arr[startRaw][startCul];

        if (x == -1) {
            isPossible = true;
            return;
        }

        if ((startCul + x) <= n) {
            dfs(startRaw, startCul+x);
        }
        if ((startRaw + x) <= n) {
            dfs(startRaw+x, startCul);
        }
    }
}