import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean stop = false;
		if(N == 1) {
			System.out.print(1);
		} else {
			int num = 2;
			int range = 6;
			int result = 2;
			while(!stop) {
				if(N >= num && N <= num + range - 1) {
					stop = true;
					System.out.print(result);
				} else {
					num += range;
					range += 6;
					result++;
				}
			}
		}
	}
}