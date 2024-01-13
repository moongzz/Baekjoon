import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean input = true;
		ArrayList<Integer> result = new ArrayList<Integer>();
		while(input) {
			String[] AB = br.readLine().split(" ");
			int sum = Integer.parseInt(AB[0])+Integer.parseInt(AB[1]);
			
			if(sum == 0) input = false;
			else result.add(sum);
		}
		
		for(int r : result) {
			System.out.println(r);
		}
		
		br.close();
	}
}