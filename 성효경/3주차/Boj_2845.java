import java.io.*;
import java.util.*;

public class Boj_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int c = l*p;

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<5; i++) {
            int x = Integer.parseInt(st.nextToken());
            System.out.printf(x-c + " ");
        }
    }
}