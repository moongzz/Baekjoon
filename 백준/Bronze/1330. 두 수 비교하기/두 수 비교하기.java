import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nums = br.readLine().split(" ");
		
		int A = Integer.parseInt(nums[0]);
		int B = Integer.parseInt(nums[1]);
		
		if(A < B) System.out.print("<");
		else if(A > B) System.out.print(">");
		else if(A == B) System.out.print("==");
		
		br.close();
	}
}