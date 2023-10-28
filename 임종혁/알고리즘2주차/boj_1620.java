package 알고리즘2주차;

import java.io.*;
import java.util.*;
public class boj_1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String , String> map = new HashMap();
        for(int i=1; i<=n; i++){
            map.put(br.readLine(), String.valueOf(i));
        }
        for(int i=0; i<m; i++){

            String s = br.readLine();

            if(map.containsValue(s)){
                for(String ss : map.keySet()){
                    if(map.get(ss).equals(s)){
                        System.out.println(ss);
                    }
                }
            }else{
                System.out.println(map.get(s));

            }
        }
    }
}
