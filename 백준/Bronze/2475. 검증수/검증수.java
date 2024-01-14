import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] input = new int[5];
		int result = 0;
		for(int i = 0; i < 5; i++) {
			input[i] = in.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			input[i] = input[i] * input[i];
			result += input[i];
		}
		System.out.println(result%10);
		in.close();
	}
}