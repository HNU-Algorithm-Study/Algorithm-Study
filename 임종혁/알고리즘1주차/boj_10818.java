package 알고리즘1주차;
import java.io.*;
import java.util.*;

public class boj_10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
 ;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0];
        int min = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(min +" " + max);


    }
}
