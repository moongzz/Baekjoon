import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int n, int j) {
        if (j == N) {
            if (isPrime(n)) System.out.println(n);
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) continue;
            if (isPrime(n * 10 + i))
                DFS(n * 10 + i, j + 1);
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }
}