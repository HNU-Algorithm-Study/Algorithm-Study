import java.io.*;
import java.util.*;

public class Boj_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<Integer>();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String s = br.readLine();

            switch (s) {
                case "pop":
                    boolean isEmpty = stack.empty();
                    if (isEmpty) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    isEmpty = stack.empty();
                    if (isEmpty) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "top":
                    isEmpty = stack.empty();
                    if (isEmpty) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                default:
                    st = new StringTokenizer(s);
                    String a = st.nextToken();
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
            }
        }
    }
}
