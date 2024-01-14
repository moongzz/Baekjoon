import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		String input = "";
		while((input=br.readLine()) != null) {
			result += input + "/";
		}
		String[] resultParts = result.split("/");
		for(String r : resultParts) {
			System.out.println(r);
		}
		br.close();
	}
}