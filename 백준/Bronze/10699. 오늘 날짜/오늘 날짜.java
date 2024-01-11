import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = simpleDateFormat.format(now);
		System.out.println(date);
	}
}