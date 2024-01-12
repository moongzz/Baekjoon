import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		
		if(90 <= score && score <= 100) System.out.print("A");
		else if(80 <= score && score <= 89) System.out.print("B");
		else if(70 <= score && score <= 79) System.out.print("C");
		else if(60 <= score && score <= 69) System.out.print("D");
		else System.out.print("F");
		
		in.close();
	}
}
