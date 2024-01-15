import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] result = new String[count];
		
		for(int i = 0; i < count; i++) {
			String[] input = br.readLine().split(" ");
			result[i] = repeatString(input);
		}
		
		for(String r : result) {
			System.out.println(r);
		}
		
		br.close();
	}
	public static String repeatString(String[] input) {
		int range = input[1].length();
		String result = "";
		for(int i = 0; i < range; i++) {
			String inputChar = input[1].charAt(i) + "";
			result += inputChar.repeat(Integer.parseInt(input[0]));
		}
		
		return result;
	}
} 