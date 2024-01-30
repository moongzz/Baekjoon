import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		while(N > result.size()) {
			result.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(result);
		
        for(int r : result) {
        	bw.write(String.valueOf(r) + "\n");
        }
        
        bw.close();
	}
}