import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<Integer> S = new HashSet<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "add":
                    S.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    S.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    sb.append(S.contains(Integer.parseInt(st.nextToken()))?"1\n":"0\n");
                    break;
                case "toggle":
                    int a = Integer.parseInt(st.nextToken());
                    if (S.contains(a)) S.remove(a);
                    else S.add(a);
                    break;
                case "all":
                    S.clear();
                    for (int j = 1; j <= 20; j++) {
                        S.add(j);
                    }
                    break;
                case "empty":
                    S.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}
