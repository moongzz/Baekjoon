import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, String> password = new HashMap<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            password.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            bw.write(password.get(br.readLine()) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
