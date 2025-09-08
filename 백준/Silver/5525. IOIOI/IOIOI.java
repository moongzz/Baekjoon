import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int count = 0;
        StringBuilder P = new StringBuilder("IOI");
        String S = br.readLine();

        if (N > 1) P.append("OI".repeat(N - 1));

        String p = String.valueOf(P);
        int index = S.indexOf(p);

        while (index != -1) {
            count++;
            int start = index;
            index = S.indexOf(p, start + 1);
        }

        System.out.println(count);
    }
}