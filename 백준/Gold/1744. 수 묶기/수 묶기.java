import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        int result = 0;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 1) plus.add(input);
            else if (input == 1) one++;
            else if (input == 0) zero++;
            else minus.add(input);
        }

        while (plus.size() > 1) {
            int f = plus.remove();
            int s = plus.remove();
            result += f * s;
        }

        if (!plus.isEmpty()) result += plus.remove();

        while (minus.size() > 1) {
            int f = minus.remove();
            int s = minus.remove();
            result += f * s;
        }

        if (!minus.isEmpty()) {
            if (zero == 0) result += minus.remove();
        }

        result += one;
        System.out.println(result);
    }
}