import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
				'u', 'v', 'w', 'x', 'y', 'z'};
		int[] result = new int[26];
		Arrays.fill(result, -1);
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < input.length(); j++) {
				if(input.charAt(j) == alphabet[i] && result[i] == -1) result[i] = j;
			}
		}
		for(int r : result) {
			System.out.print(r + " ");
		}
		br.close();
	}
}