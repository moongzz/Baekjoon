import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		String product = String.valueOf(A*B*C);
		int[] result = new int[10];
		
		for(int i = 0; i < product.length(); i++) {
			int index = product.charAt(i) - '0';
			result[index]++;
		}
		
		for(int r : result) {
			System.out.println(r);
		}
		in.close();
	}
}