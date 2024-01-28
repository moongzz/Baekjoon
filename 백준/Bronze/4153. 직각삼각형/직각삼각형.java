import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean stop = false;
		ArrayList<String> result = new ArrayList<>();
		int[] inputArray = new int[3];
		while(!stop) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			inputArray[0] = Integer.parseInt(st.nextToken());
			inputArray[1] = Integer.parseInt(st.nextToken());
			inputArray[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(inputArray);
			if(inputArray[0] == 0 && inputArray[1] == 0 && inputArray[2] == 0) {
				stop = true;
			} else if(inputArray[0] * inputArray[0] + inputArray[1] * inputArray[1] == inputArray[2] * inputArray[2]) {
				result.add("right");
			} else {
				result.add("wrong");
			}
		}
		for(String r : result) {
			System.out.println(r);
		}
	}
}