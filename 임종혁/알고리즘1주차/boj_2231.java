package 알고리즘1주차;
import java.io.*;
import java.util.*;
public class boj_2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if(n/10 == 0){

        }else{
            int sum = 0;
            for(int i=1; i<=n; i++){
                String s = String.valueOf(i);


                sum=0;
                sum += Integer.parseInt(s);

                for(int j=0; j<s.length(); j++){
                    sum += Integer.parseInt(String.valueOf(s.charAt(j)));
                }
                if(sum == n){
                    sum =Integer.parseInt(s);
                   break;
                }

            }
            System.out.println(sum);

        }

    }
}
