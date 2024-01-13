import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine()); 
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i<count; i++) {
			String[] AB = br.readLine().split(" ");
			int sum = Integer.parseInt(AB[0])+Integer.parseInt(AB[1]);
			result.add(i, sum);
		}
		
		for(int r : result) {
			System.out.println(r);
		}
		
		br.close();
	}
}