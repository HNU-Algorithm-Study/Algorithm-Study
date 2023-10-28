package 알고리즘2주차;
import java.io.*;
import java.util.*;

public class boj_24417 {
    static long count = 0;
    static long coutd =0;
    static long[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        fibo(n);

        count %= 1000000007;

        dp = new long[n];
        dp[0] = 1;
        dp[1] = 1;

        coutd = n -2;
        System.out.println(count + " " + coutd);
    }
    public static long fibo(int n){
        if (n==1){
            count++;
            return count;
        }
        if(n==2){
            count++;
            return count;
        }

        return (count + fibo(n-1) + fibo(n-2))%1000000007;
    }
}
