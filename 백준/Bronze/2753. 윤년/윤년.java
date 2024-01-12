import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int result = 0;
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
			result = 1;
		else 
			result = 0;
		
		System.out.print(result);
		in.close();
	}
}