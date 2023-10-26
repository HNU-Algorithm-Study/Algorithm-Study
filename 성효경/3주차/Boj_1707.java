import java.io.*;
import java.util.*;

public class Boj_1707 {

    static final int RED = 1;
    static final int BLUE = -1;

    static int node, link;

    static ArrayList<ArrayList<Integer>> arr;
    static int[] colors;
    static boolean ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());

        for (int i=0; i<k; i++) {
            st = new StringTokenizer(br.readLine());

            node = Integer.parseInt(st.nextToken());
            link = Integer.parseInt(st.nextToken());

            arr = new ArrayList<>();
            for (int j=1; j<node+1; j++) {
                arr.add(new ArrayList<>());
            }

            for (int j=0; j<link; j++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr.get(a).add(b);
                arr.get(b).add(a);
            }

            ans = true;
            colors = new int[node+1];
            for (int j=1; j<=node; j++) {
                if (colors[j] == 0) {
                    if (ans = dfs(i, RED)) break;
                }
            }

            System.out.println(ans ? "YES" : "NO");
        }
    }
    public static boolean dfs(int start, int color) {
        colors[start] = color;

        for (int i : arr.get(start)) {
            if (colors[i] == color) {
                ans = false;
                return true;
            }
            if (colors[i] == 0) {
                if (dfs(i, -color)) {
                    return true;
                }
            }
        }

        return false;
    }
}