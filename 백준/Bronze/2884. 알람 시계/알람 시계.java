import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minute = in.nextInt();
		
		if(minute == 45) minute = 0;
		else if(minute > 45) minute -= 45;
		else if(minute < 45) {
			minute = 60-45+minute;
			hour-=1;
			if(hour < 0) hour = 23;
		}
		System.out.println(hour + " " + minute);
		in.close();
	}
}