import java.io.*;

public class Boj_2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());

        int cnt5 = kg/5;
        int cnt3 = 0;
        for (int i=cnt5; i>0; i--) {
            if ((kg-(i*5)) % 3 == 0) {
                cnt5 = i;
                break;
            } else {
                cnt5 = 0;
            }
        }
        cnt3 = (kg-(5*cnt5)) / 3;
        int answer = cnt5+cnt3;

        if ((kg-(5*cnt5)) % 3 != 0) {
            answer = -1;
        }

        System.out.println(answer);
    }
}
