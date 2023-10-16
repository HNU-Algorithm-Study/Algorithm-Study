import java.io.*;
import java.util.*;

public class Boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String s = br.readLine();

            boolean isVPS = solve(s);
            if (isVPS) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean solve(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int j=0; j<s.length(); j++) {
            if (s.charAt(j) == '(') {
                stack.push('(');
            } else if (stack.empty()) {
                return false;
            } else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}
