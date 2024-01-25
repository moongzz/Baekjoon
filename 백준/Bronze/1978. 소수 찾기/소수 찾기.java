import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int result = 0;
		for(int i = 0; i < N; i++) {
			if(isPrime(Integer.parseInt(st.nextToken()))) result++;
		}
		System.out.print(result);
	}
	
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i * i <= num; i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
}