import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] popularity = br.readLine().split(" ");
		
		long N = Long.parseLong(popularity[0]);
		long M = Long.parseLong(popularity[1]);
		
		long result = N-M;
		
		if(result < 0) System.out.print(-result);
		else System.out.print(result);
		
		br.close();
	}
}