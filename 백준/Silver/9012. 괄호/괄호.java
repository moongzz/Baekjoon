import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		for(int i = 0; i < T; i++) {
			result[i] = findVPN(br.readLine());
		}
		for(String r : result) {
			System.out.println(r);
		}
	}
	
	public static String findVPN(String originalInput) {
		StringBuilder input = new StringBuilder(originalInput);
		if(input.charAt(0) == ')' || input.charAt(input.length()-1) == '(') {
			return "NO";
		}
		for(int i = 1; i < input.length(); i++)	{
			if(input.charAt(0) == '(' && input.charAt(i) == ')') {
				input.deleteCharAt(i);
				input.deleteCharAt(0);
				i = 0;
			}
		}
		if(input.length() == 0) return "YES";
		else return "NO";
	}
}