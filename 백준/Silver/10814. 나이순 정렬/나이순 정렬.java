import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Pair<Integer, String>[] arr = new Pair[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Pair<Integer, String> pair = new Pair<>(Integer.parseInt(st.nextToken()), st.nextToken());
            arr[i] = pair;
        }
        Arrays.sort(arr, (a,b) -> a.getLeft() - b.getLeft());
        for (Pair<Integer, String> p : arr) {
            System.out.println(p.toString());
        }
    }

    public static class Pair<L, R> {
        private final L left;
        private final R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public L getLeft() { return left; }

        public String toString() {
            return left + " " + right;
        }
    }
}
