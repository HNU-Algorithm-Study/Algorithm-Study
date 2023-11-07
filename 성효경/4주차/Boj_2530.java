import java.io.*;
import java.util.*;

public class Boj_2530 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        int tmpsec = sec + time;
        int tmpmin = 0;
        int tmphour = 0;
        if (tmpsec >= 60) {
            tmpmin = tmpsec / 60;
            tmpsec %= 60;
        }
        tmpmin += min;
        if (tmpmin >= 60) {
            tmphour = tmpmin / 60;
            tmpmin %= 60;
        }
        tmphour += hour;
        if (tmphour >= 24) {
            tmphour %= 24;
        }

        System.out.println(tmphour + " " + tmpmin + " " + tmpsec);
    }
}