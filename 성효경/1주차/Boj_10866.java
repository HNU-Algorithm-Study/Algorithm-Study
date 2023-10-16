import java.io.*;
import java.util.*;

public class Boj_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> d = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String s = br.readLine();
            String[] order = s.split(" ");

            switch (order[0]) {

                case "push_front":
                    int x = Integer.parseInt(order[1]);
                    d.offerFirst(x);
                    break;

                case "push_back":
                    x = Integer.parseInt(order[1]);
                    d.offerLast(x);
                    break;

                case "pop_front":
                    if (d.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(d.pollFirst());
                    }
                    break;

                case "pop_back":
                    if (d.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(d.pollLast());
                    }
                    break;

                case "size":
                    System.out.println(d.size());
                    break;

                case "empty":
                    if (d.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;

                case "front":
                    if (d.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(d.getFirst());
                    }
                    break;

                case "back":
                    if (d.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(d.getLast());
                    }
                    break;
            }
        }
    }
}
