import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] result = new String[count];
		for(int i = 0; i < count; i++) {
			String input = br.readLine();
			result[i] = input.charAt(0) + "" + input.charAt(input.length()-1);
		}
		for(String r : result) {
			System.out.println(r);
		}
	}
}