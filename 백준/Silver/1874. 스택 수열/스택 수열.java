import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] input = new int[count];

		for(int i = 0; i < count; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		ArrayList<String> result = lifo(input, count);
		if(result.size() != count * 2) {
			System.out.print("NO");
		} else {
			for(String r : result) {
				System.out.println(r);
			}			
		}
	}
	public static ArrayList<String> lifo(int[] input, int count) {
		ArrayList<String> result = new ArrayList<String>();
		Stack<Integer> sequence = new Stack<Integer>();
		int index = 0;
		for(int i = 1; i <= count; i++) {
			sequence.push(i);
			result.add("+");
			
			while(!sequence.isEmpty() && sequence.peek() == input[index]) {
				result.add("-");
				sequence.pop();
				index++;
			}
		}
		return result;
	}
}