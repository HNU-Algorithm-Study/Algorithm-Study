package 알고리즘1주차;
import java.util.*;
import  java.io.*;
public class boj_1270 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tk = Integer.parseInt(br.readLine());

        for(int i=0; i<tk; i++){
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            Map<Integer, Integer> map = new HashMap();

            for(int j=0; j<n; j++){
                int a = Integer.parseInt(st.nextToken());

                if(map.containsKey(a)){
                    map.replace(a,map.get(a)+1);
                }else{
                    map.put(a,1);
                }
            }
            int k = 0;
            boolean b = true;
            for(int key : map.keySet()){
                if(map.get(key)>n/2){
                    System.out.println(key);
                    b= false;
                    break;
                }
            }
            if(b){
                System.out.println("SYJKGW");
            }
        }
    }
}
