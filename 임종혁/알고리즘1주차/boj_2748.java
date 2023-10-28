package 알고리즘1주차;
import java.io.*;

public class boj_2748 {
    public static int[] a;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        a = new int[n+1];




        for(int i = 0; i <  n+ 1; i++) {
            a[i] = -1;
        }
        a[0] = 0;
        a[1] = 1;

        System.out.println(dp(n));



    }
    public static int dp(int n){
        if(a[n] == -1){
            a[n] = dp(n-1) + dp(n-2);
        }
        return a[n];

    }
}
