import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		char[] inputChar = input.toCharArray();
		int[] ascii = new int[input.length()];
		char[] result = new char[input.length()];
		
		for(int i = 0; i < input.length(); i++) {
			ascii[i] = (int) inputChar[i];
		}
		for(int i = 0; i < input.length(); i++) {
			if(97 <= ascii[i]) result[i] = (char) (ascii[i]-32);
			else if(ascii[i] <= 96) result[i] = (char) (ascii[i]+32);
		}
		for(char r : result) {
			System.out.print(r);
		}
	}
}