import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] NX = br.readLine().split(" ");
		String[] value = br.readLine().split(" ");
		String result = "";
		
		for(String v : value) {
			if(Integer.parseInt(v) < Integer.parseInt(NX[1])) {
				result += v + " ";
			}
		}
		
		bw.write(result.trim());
		br.close();
		bw.flush();
	}
}