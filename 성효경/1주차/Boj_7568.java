import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        StringTokenizer st;

        for (int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }

        int[] dArr = new int[n];

        for (int i=0; i<n; i++) {
            int rank = 1;
            st = new StringTokenizer(arr[i]);
            int weightA = Integer.parseInt(st.nextToken());
            int heightA = Integer.parseInt(st.nextToken());

            for (int j=0; j<n; j++) {
                if (i==j) continue;
                st = new StringTokenizer(arr[j]);
                int weightB = Integer.parseInt(st.nextToken());
                int heightB = Integer.parseInt(st.nextToken());

                if (weightA<weightB && heightA<heightB) rank++;
            }
            dArr[i] = rank;
        }

        for (int e : dArr) {
            System.out.printf(e + " ");
        }
    }
}
