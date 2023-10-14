package 알고리즘1주차;

import java.io.*;
public class boj_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s= br.readLine();
        int sum = 0;
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += a;
        }

        System.out.println(sum);
    }
}
