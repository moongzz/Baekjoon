import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		String[] input = br.readLine().split(" ");
		int[] inputArr = new int[count];
		
		for(int i = 0; i < input.length; i++) {
			inputArr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(inputArr);
		System.out.print(inputArr[0] + " " + inputArr[inputArr.length-1]);
		br.close();
	}
}