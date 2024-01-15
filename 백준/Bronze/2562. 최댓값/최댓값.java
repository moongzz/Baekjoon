import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] inputArr = new int[9];
		int[] inputArr2 = new int[9];
		
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = in.nextInt();
			inputArr2[i] = inputArr[i];
		}
		
		Arrays.sort(inputArr);
		int maxValue = inputArr[8];
		System.out.println(maxValue);
		
		for(int i = 0; i < inputArr2.length; i++) {
			if(inputArr2[i] == maxValue) System.out.print(i+1);
		}
		
		in.close();
	}
}