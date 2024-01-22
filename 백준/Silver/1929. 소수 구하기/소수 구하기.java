import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) result.add(i);
		}
		for(int r : result) {
			System.out.println(r);
		}
	}
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}