import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        Pair[] B = new Pair[N];

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(st.nextToken());
            A[i] = v;
            B[i] = new Pair(v, i);
        }

        Arrays.sort(B, Comparator.comparingInt(b -> b.value));

        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            int move = B[i].index - i;
            if (move > maxMove) maxMove = move;
        }

        System.out.println(maxMove);
    }

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.index = index;
            this.value = value;
        }
    }
}