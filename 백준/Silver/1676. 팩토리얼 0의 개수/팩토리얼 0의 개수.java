import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		BigInteger factorial = BigInteger.ONE;
		for(int i = 1; i <= input; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		BigInteger divisor = new BigInteger("10");
		int count = 0;
		while(factorial.remainder(divisor).equals(BigInteger.ZERO)) {
			divisor = divisor.multiply(BigInteger.TEN);
			count++;
		}
		System.out.print(count);
	}
}