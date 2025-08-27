import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens = input.split("-");
        int[] sums = new int[tokens.length];

        for (int i = 0; i < sums.length; i++) {
            String[] values = tokens[i].split("\\+");
            for (String v : values) {
                sums[i] += Integer.parseInt(v);
            }
        }

        int result = sums[0];
        for (int i = 1; i < sums.length; i++) {
            result -= sums[i];
        }

        System.out.println(result);
    }
}