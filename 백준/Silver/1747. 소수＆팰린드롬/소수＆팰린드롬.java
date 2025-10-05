import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i] == 0) continue;
            for (int j = i + i; j < arr.length; j += i) {
                arr[j] = 0;
            }
        }

        int i = N;
        while (true) {
            if (arr[i] != 0) {
                if (isPalindrome(arr[i])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
            i++;
        }
    }

    private static boolean isPalindrome(int target) {
        char[] temp = String.valueOf(target).toCharArray();
        int s = 0;
        int e = temp.length - 1;
        while (s < e) {
            if (temp[s] != temp[e]) return false;
            s++;
            e--;
        }
        return true;
    }
}
