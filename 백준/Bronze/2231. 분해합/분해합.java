import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.print(findGenerator(N));
	}
	public static int findGenerator(int N) {
		for (int i = 1; i < N; i++) {
			int sum = i;
			int num = i;
			
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			if (sum == N) {
				return i;
			}
		}
		return 0;
	}
}