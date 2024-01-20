import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		float[] score = new float[N];
		for(int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(score);
		float sum = 0;
		for(int i = 0; i < N; i++) {
			sum += score[i] / score[N-1] * 100;
		}
		System.out.print(sum / N);
	}
}