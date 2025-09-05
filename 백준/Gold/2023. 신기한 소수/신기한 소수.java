import java.util.Scanner;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static void DFS(int a, int j) {
        if (j == n) {
            if (isPrime(a)) System.out.println(a);
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) continue;
            if (isPrime(a * 10 + i)) DFS(a * 10 + i, j + 1);
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
