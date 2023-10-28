package 알고리즘2주차;
import java.io.*;
import java.nio.Buffer;
import  java.util.*;
public class boj_1021 {
    private  static  int count;
    public static  void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        LinkedList<Integer> dq = new LinkedList();
        for(int i=1; i<=n; i++){

            dq.offer(i);
        }

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++){
            int a = Integer.parseInt(st.nextToken());

            int idx = dq.indexOf(a);

            int h;
            count = 0;
            if(dq.size()%2 ==0){
                h = dq.size()/2 -1;
            }else{
                h = dq.size()/2;
            }



            if(i<=h){
                for(int k =0; k<idx; k++){
                    int temp = dq.pollFirst();
                    dq.offerLast(temp);
                    count++;
                }
            }else{
                for(int j = 0; j < dq.size() - idx; j++) {
                    int temp = dq.pollLast();
                    dq.offerFirst(temp);
                    count++;
                }
            }
            dq.pollFirst();
        }
        System.out.println(count);




    }
}
