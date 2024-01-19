import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = find(n);
		System.out.println(result);
	}
	public static int find(int n) {
		int count = 0;
		int number = 1;
		
		while(count < n) {
			if(contains666(number)) {
				count++;
			}
			if(count < n) {
				number++;
			}
		}
		return number;
	}
	public static boolean contains666(int number) {
		while(number > 0) {
			if(number % 1000 == 666 || number % 100 == 666 || number % 10 == 666) {
				return true;
			}
			number /= 10;
		}
		return false;
	}
}