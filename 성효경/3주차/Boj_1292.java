import java.io.*;
import java.util.*;

public class Boj_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        for (int i=1; i<=b; i++) {
            for (int j=0; j<i; j++) {
                stack.add(i);
            }
        }

        int sum = 0;
        for (int i=b; i>=a; i--) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}