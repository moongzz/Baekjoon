import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		char[] score = input.toCharArray();
		int result1 = 0;
		int result2 = 0;
		
		if(input.length() == 2) {
			if(score[0] == 'A') result1 = 4;
			else if(score[0] == 'B') result1 = 3;
			else if(score[0] == 'C') result1 = 2;
			else if(score[0] == 'D') result1 = 1;
			
			if(score[1] == '0') result2 = 0;
			else if(score[1] == '+') result2 = 3;
			else if(score[1] == '-') {
				result1 -= 1;
				result2 = 7;
			}
		} else {
			if(score[0] == 'F') {
				result1 = 0;
				result2 = 0;
			}
		}
		
		System.out.print(result1 + "." + result2);
	}
}