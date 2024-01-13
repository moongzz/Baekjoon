import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Set<Integer> input = new HashSet<Integer>();
		for(int i = 0; i < 28; i++) {
			input.add(in.nextInt());
		}
		
		Set<Integer> result = new HashSet<Integer>();
		for(int i = 1; i <= 30; i++) {
			result.add(i);
		}
		
		result.removeAll(input);
		
		for(int r : result) {
			System.out.println(r);
		}
		
		in.close();
	}
}