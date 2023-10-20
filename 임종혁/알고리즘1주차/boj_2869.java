package 알고리즘1주차;
import java.io.*;
import java.util.StringTokenizer;

public class boj_2869 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int count =1;
        int h = 0;

        count = 1;
        while (true){
            h+=a;

            if(h >= v){
                System.out.println(count);
                break;
            }
            h-=b;
            count++;


        }


    }
}
