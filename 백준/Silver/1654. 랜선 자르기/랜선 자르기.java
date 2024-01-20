import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		long[] size = new long[K];
		long max = 0;
		
		for(int i = 0; i < K; i++) {
			size[i] = Long.parseLong(br.readLine());
			max = Math.max(max, size[i]);
		}
		System.out.print(binarySearch(size, N, max));
		
	}
	public static long binarySearch(long[] size, int target, long max) {
		long result = 0;
		long left = 1;
		long right = max;
		
		while(left <= right) {
			long mid = (left+right) / 2;
			int count = 0;
			
			for(long s : size) {
				count += s / mid;
			}
			
			if(count >= target) {
				result = Math.max(result, mid);
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return result;
	}
}