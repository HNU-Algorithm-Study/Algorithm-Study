package 알고리즘1주차;
import java.io.*;
public class boj_14606 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(0);
        }else{
            System.out.println(dp(n));
        }
    }
    public static int dp(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int num = n/2;

        if((num+num) != n ){
            return ((num)*(num+1)) + dp(num) + dp(num+1);
        }else{
            return ((num)*(num)) + dp(num) + dp(num);
        }


    }
}
