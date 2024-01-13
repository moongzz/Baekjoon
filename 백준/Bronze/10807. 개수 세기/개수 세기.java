import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		String[] arr = br.readLine().split(" ");
		String v = br.readLine();
		
		int result = 0;
		
		for(String a : arr) {
			if(a.equals(v)) result ++;
		}
		
		bw.write(result + "");
		
		br.close();
		bw.flush();
	}
}