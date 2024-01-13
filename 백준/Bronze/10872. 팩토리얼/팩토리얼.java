import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int result = 1;
		
		for(int i = 1; i <= N; i++) {
			result *= i;
		}
		
		System.out.println(result);
		in.close();
	}
}