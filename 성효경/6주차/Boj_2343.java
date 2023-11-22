import java.io.*;
import java.util.*;

public class Boj_2343 {

    private static int n, m;
    private static int[] lectureArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        lectureArr = new int[n];
        m = Integer.parseInt(st.nextToken());
        int[] bluerayArr = new int[m];

        int max = 0;
        int min = 0;
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            lectureArr[i] = Integer.parseInt(st.nextToken());
            max += lectureArr[i];
            min = Math.max(min, lectureArr[i]);
        }

        System.out.println(search(min, max));
    }

    private static int search(int min, int max) {
        int mid, sum, count;

        while (min <= max) {
            mid = (min+max) / 2;
            count = 1;
            sum = 0;

            for (int l : lectureArr) {
                sum += l;

                if (sum > mid) {
                    sum = l;
                    count++;
                }
            }

            if (count > m) {
                min = mid+1;
            } else {
                max = mid-1;
            }
        }

        return min;
    }
}