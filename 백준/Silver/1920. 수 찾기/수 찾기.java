import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] inputN = inputArray(br);
		int[] inputM = inputArray(br);
		int[] result = new int[inputM.length];
		Arrays.fill(result, 0);
		
		Set<Integer> setN = new HashSet<>();
		for(int n : inputN) {
			setN.add(n);
		}
		for(int i = 0; i < inputM.length; i++) {
			result[i] = setN.contains(inputM[i]) ? 1 : 0;
		}
		for(int r : result) {
			System.out.println(r);
		}
	}
	
	public static int[] inputArray(BufferedReader br) throws IOException {
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] intArray = new int[count];
		
		for(int i = 0 ; i < count; i++) {
			intArray[i] = Integer.parseInt(st.nextToken());
		}
		return intArray;
	}
}