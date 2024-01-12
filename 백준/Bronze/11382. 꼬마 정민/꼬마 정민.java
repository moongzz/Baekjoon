import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		
		long result = 0;
		for(String num : nums) {
			result += Long.parseLong(num);
		}
		System.out.println(result);
		br.close();
	}
}