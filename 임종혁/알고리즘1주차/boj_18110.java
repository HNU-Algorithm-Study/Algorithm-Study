package 알고리즘1주차;

import java.io.*;
import java.util.Arrays;

public class boj_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        int trim = (int) Math.round(n*0.15);
        int sum = 0;

        for(int i=trim; i<n-trim; i++){
            sum += num[i];

        }

        System.out.println(Math.round((double) sum / (n - trim * 2)));
    }
}
