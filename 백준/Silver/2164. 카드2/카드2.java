import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedList<Integer> result = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			result.add(i);
		}
		while(result.size() != 1) {
			result.remove(0);
			int topCard = result.remove(0);
			result.add(topCard);
		}
		System.out.print(result.get(0));
	}
}