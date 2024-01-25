import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] resultArray = new int[count];
		for(int i = 0; i < count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			Queue<Document> queue = new LinkedList<>();
			for(int j = 0; j < N; j++) {
				queue.offer(new Document(j, Integer.parseInt(st2.nextToken())));
			}
			int result = 0;
			while(!queue.isEmpty()) {
				Document current = queue.poll();
				if(hasPriority(queue, current.priority)) {
					queue.offer(current);
				} else {
					result++;
					if(current.index == M) {
						resultArray[i] = result;
						break;
					}
				}
			}
		}
		for(int r : resultArray) {
			System.out.println(r);
		}
	}
	public static boolean hasPriority(Queue<Document> queue, int priority) {
		for(Document document : queue) {
			if(document.priority > priority) {
				return true;
			}
		}
		return false;
	}
}
class Document {
	int index;
	int priority;
	
	public Document(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}
}