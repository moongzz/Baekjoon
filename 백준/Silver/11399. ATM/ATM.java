import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] P = new int[N];
        int[] S = new int[N];   // 합 배열

        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < N; i++) {
            int point = i;
            int value = P[i];
            for (int j = i - 1; j >= 0; j--) {
                if (P[j] < P[i]) {
                    point = j + 1;
                    break;
                }
                if (j == 0) {
                    point = 0;
                }
            }
            for (int j = i; j > point; j--) {
                P[j] = P[j - 1];
            }
            P[point] = value;
        }

        S[0] = P[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + P[i];
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += S[i];
        }
        System.out.println(sum);
    }
}