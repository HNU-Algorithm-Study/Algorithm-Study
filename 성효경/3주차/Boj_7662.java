import java.io.*;
import java.util.*;

public class Boj_7662 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            solve();
        }

        System.out.println(sb);
    }

    private static void solve() throws IOException {

        TreeMap<Integer, Integer> map = new TreeMap<>();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            char order = st.nextToken().charAt(0);
            int num = Integer.parseInt(st.nextToken());

            int del;
            if (order == 'D') {
                if (map.isEmpty()) {
                    continue;
                } else if (num == 1) {
                    del = map.lastKey();
                } else {
                    del = map.firstKey();
                }
                map.remove(del);
            } else {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }

        if (map.isEmpty()) {
            sb.append("EMPTY\n");
        } else {
            sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
        }
    }
}