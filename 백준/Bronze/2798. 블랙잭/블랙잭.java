import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] cards = new int[N];
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st2.nextToken());
		}
		System.out.print(game(cards, N, M));
	}
	public static int game(int[] cards,int N, int M) {
		int result = 0;
		int diff = M;
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				for(int q = j+1; q < N; q++) {
					int sum = cards[i] + cards[j] + cards[q];
					if(sum == M) return sum;
					else if(sum < M && diff > M-sum	) {
						diff = M-sum;
						result = sum;
					}
				}
			}
		}
		return result;
	}
}