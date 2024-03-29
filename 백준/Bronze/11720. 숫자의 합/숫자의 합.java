import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int result = 0;
		for(int i = 0; i < len; i++) {
			result += Character.getNumericValue(input.charAt(i));
		}
		System.out.print(result);
		br.close();
	}
}