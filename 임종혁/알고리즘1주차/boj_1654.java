package 알고리즘1주차;
import java.io.*;
import java.util.*;
public class boj_1654 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;
    st = new StringTokenizer(br.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());

    int[] num = new int[k];

    int max = 0;
    int min = 0;

    for(int i=0; i<k; i++){
        num[i] = Integer.parseInt(br.readLine());
        if(max<num[i]){
            max = num[i];
        }
    }


    int mid = 0;

    while(min<max){

        mid = (max + min)/2;

        long count = 0;

        for(int i=0; i<num.length; i++){
            count += num[i]/ mid;
        }


        if(count < n){
            max = mid-1;
        }else{
            min = mid ;
        }

    }
    System.out.println(max);

}
}


