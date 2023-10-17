import java.io.*;
import java.util.*;

public class Boj_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            int value = Integer.parseInt(st.nextToken());
            System.out.printf(findValue(arr, value, 0, n-1) + " ");
        }
    }

    public static int findValue(int[] arr, int value, int start, int finish) {
        int mid = 0;
        while (start <= finish) {
            mid = (start+finish) / 2;

            if (value == arr[mid]) {
                return calcFreq(arr, value, mid);
            } else if (value < arr[mid]) {
                return findValue(arr, value, 0, mid-1);
            } else {
                return findValue(arr, value, mid+1, 0);
            }
        }
        return 0;
    }

    public static int calcFreq(int[] arr, int value, int index) {
        int freq = 1;
        int idx = index-1;

        while (arr[idx] == value) {
            freq++;
            idx--;
        }
        idx = index+1;
        while (arr[idx] == value) {
            freq++;
            idx++;
        }

        return freq;
    }
}