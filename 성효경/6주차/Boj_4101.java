import java.io.*;

public class Boj_4101 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        while (!input.equals("0 0")) {
            String[] arr = input.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);

            if (a>b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            input = br.readLine();
        }
    }
}