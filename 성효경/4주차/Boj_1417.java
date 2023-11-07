import java.io.*;
import java.util.*;

public class Boj_1417 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int dasom = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for (int i=1; i<n; i++) {
            q.add(Integer.parseInt(br.readLine()));
        }

        while (dasom+count <= q.peek() && !q.isEmpty()) {
            count++;
            q.add(q.poll() -1);
        }

        System.out.println(count);
    }
}


/*
import java.io.*;
import java.util.*;

public class BOJ_1417_국회의원선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(in.readLine());
        int dasom = Integer.parseInt(in.readLine());

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((o1,o2)->o2.compareTo(o1));

        for(int i=0;i<N-1;i++) pQueue.offer(Integer.parseInt(in.readLine()));

        int cnt = 0;
        while(!pQueue.isEmpty() && dasom++<=pQueue.peek()){
            pQueue.offer(pQueue.poll()-1);
            ++cnt;
        }

        System.out.println(cnt);

    }
}*/
