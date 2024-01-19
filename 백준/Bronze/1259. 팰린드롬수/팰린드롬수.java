import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean stop = false;
		String result = "";
		while(!stop) {
			String input = br.readLine();
			int index = input.length() - 1;
			int add = input.length() - 1;
			int count = 0;
			if(input.equals("0")) stop = true;
			else {
				for(int i = 0; i < (input.length()+1)/2; i++) {
					if(i != 0) {
						add -= 2;
						index = i + add;
					}
					if(input.charAt(i) == input.charAt(index) || index == 0) count++;
				}
				if(count == (input.length()+1)/2) result += "yes ";
				else result += "no ";
			}
		}
		String[] resultArray = result.split(" ");
		for(String r : resultArray) {
			System.out.println(r);
		}
	}
}