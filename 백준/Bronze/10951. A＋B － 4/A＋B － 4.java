import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(in.hasNextInt()) {
			int A = in.nextInt();
			int B = in.nextInt();
			result.add(A + B);
		}
		for(int r : result) {
			System.out.println(r);
		}
		
		in.close();
	}
}