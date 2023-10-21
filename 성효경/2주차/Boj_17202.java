import java.io.*;

public class Boj_17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String c = "";
        for (int i=0; i<8; i++) {
            c += a.charAt(i);
            c += b.charAt(i);
        }

        String answer = dp(c);
        System.out.println(answer);
    }

    public static String dp(String c) {
        if (c.length() == 2) {
            return c;
        }
        String tmp = "";
        for (int i=0; i<c.length()-1; i++) {
            int t = ((int)c.charAt(i) - 48) + ((int)c.charAt(i+1) - 48);
            if (t>9) t %= 10;
            tmp += (char)(t+48);
        }
        return dp(tmp);
    }
}