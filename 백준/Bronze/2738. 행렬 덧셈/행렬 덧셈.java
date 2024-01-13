import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] range = br.readLine().split(" ");
		
		int N = Integer.parseInt(range[0]);
		int M = Integer.parseInt(range[1]);
		
		String[][] A = new String[N][M];
		String[][] B = new String[N][M];
		String[][] result = new String[N][M];

		for(int i = 0; i < N ; i++) {
			A[i] = br.readLine().split(" ");
		}
		for(int i = 0; i < N ; i++) {
			B[i] = br.readLine().split(" ");
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				result[i][j] = (Integer.parseInt(A[i][j]) + Integer.parseInt(B[i][j])) + "";
			}
		}
		
		String resultStr = "";
		for(String[] r : result) {
			String str = "";
			for(String R : r) {
				str += R + " ";
			}
			resultStr += str.trim();
			resultStr += "\n";
		}
		
		bw.write(resultStr);
		
		br.close();
		bw.flush();
	}
}