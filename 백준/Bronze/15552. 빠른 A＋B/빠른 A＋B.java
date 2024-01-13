import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> result = new ArrayList<String>();
		
		int count = Integer.parseInt(br.readLine()); 
		
		for(int i = 0; i < count; i++) {
			String[] AB = br.readLine().split(" ");
			int sum = Integer.parseInt(AB[0])+Integer.parseInt(AB[1]);
			result.add(sum + "");
		}
		
		for(String r : result) {
			bw.write(r);
			bw.newLine();
		}
		
		br.close();
		bw.flush();
	}
}