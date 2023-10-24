import java.io.*;
import java.util.*;

public class Boj_1337 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);

        boolean isTrue = false;
        int cnt = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<n; i++) {
            if (!isTrue) {
                if (arr[i] == arr[i-1]+1) {
                    isTrue = true;
                    cnt++;
                }
            } else {
                if (arr[i] == arr[i-1]+1) {
                    cnt++;
                    if (i==n-1) {
                        list.add(cnt);
                    }
                } else {
                    list.add(cnt);
                    cnt = 1;
                    isTrue = false;
                }
            }
        }
        if (list.isEmpty()) {
            list.add(1);
        }

        list.sort(Comparator.reverseOrder());
        if (list.get(0) >= 5) {
            System.out.println(0);
        } else {
            System.out.println(5 - list.get(0));
        }
    }
}