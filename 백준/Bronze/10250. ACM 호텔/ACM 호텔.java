import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		String[] result = new String[count];
		for(int i = 0; i < count; i++) {
			int H = in.nextInt();
			int W = in.nextInt();
			int N = in.nextInt();
			
			int resultH = N%H;
			int resultW = N/H;
			
			if(resultH == 0) resultH = H;
			else resultW++;
			if(resultW > 9) result[i] = resultH + "" + resultW;
			else result[i] = resultH + "0" + resultW;
		}
		for(String r : result) {
			System.out.println(r);
		}
		in.close();
	}
}