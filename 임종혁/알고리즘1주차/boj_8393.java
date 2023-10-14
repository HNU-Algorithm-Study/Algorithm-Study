package 알고리즘1주차;
import java.util.*;
import java.io.*;
public class boj_8393 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println(sol(n));

    }
    public static int sol(int num){
        if(num == 1){
            return 1;
        }
        return num + sol(num-1);
    }


}
