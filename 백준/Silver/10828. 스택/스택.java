import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < count; i++) {
            int num = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();

            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch (method) {
                case "push":
                    result.push(num);
                    break;
                case "pop":
                    System.out.println(result.empty() ? -1 : result.pop());
                    break;
                case "size":
                    System.out.println(result.size());
                    break;
                case "empty":
                    System.out.println(result.empty() ? 1 : 0);
                    break;
                case "top":
                    System.out.println(result.empty() ? -1 : result.peek());
                    break;
            }
        }
    }
}
