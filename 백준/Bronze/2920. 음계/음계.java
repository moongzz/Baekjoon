import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] melody = {"c", "d", "e", "f", "g", "a", "b", "C"};
		String result = "";
		for(int i = 0; i < input.length; i++) {
			result += melody[Integer.parseInt(input[i])-1];
		}
		if(result.equals("cdefgabC")) System.out.print("ascending");
		else if(result.equals("Cbagfedc")) System.out.print("descending");
		else System.out.print("mixed");
		br.close();
	}
}