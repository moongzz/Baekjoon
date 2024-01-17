import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] inputArray = new String[count];
		int[] result = new int[count];
		int score = 0;
		
		for(int i = 0; i < count; i++) {
			inputArray[i] = br.readLine();
			for(int j = 0; j < inputArray[i].length(); j++) {
				if(inputArray[i].charAt(j) == 'O') {
					score++;
					result[i] += score;
				} else if(inputArray[i].charAt(j) == 'X') {
					score = 0;
				}
			}
			score = 0;
		}
		
		for(int r : result) {
			System.out.println(r);
		}
	}
}