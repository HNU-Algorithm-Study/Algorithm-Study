import java.io.*;
import java.util.*;

public class Boj_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                list.add(num);
            } else {
                list.remove(list.size()-1);
            }
        }

        IntSummaryStatistics statistics = list
                .stream().mapToInt(num -> num).summaryStatistics();

        System.out.println(statistics.getSum());
    }
}
