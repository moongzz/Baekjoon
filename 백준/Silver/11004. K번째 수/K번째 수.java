import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(A, 0, N-1, K-1);
        System.out.println(A[K-1]);
    }

    static void quickSort(int[] A, int start, int end, int K) {
        if (start < end) {
            int pivot = partition(A, start, end);
            if (pivot == K) return;
            else if (pivot > K) quickSort(A, start, pivot - 1, K);
            else quickSort(A, pivot + 1, end, K);
        }
    }

    static int partition(int[] A, int start, int end) {
        if (start + 1 == end) {
            if (A[start] > A[end]) swap(A, start, end);
            return end;
        }
        int M = (start + end) / 2;
        swap(A, start, M);
        int pivot = A[start];
        int i = start + 1;
        int j = end;
        while(i <= j) {
            while (j >= start + 1 && pivot < A[j]) j--;
            while (i <= end && pivot > A[i]) i++;
            if (i <= j) swap(A, i++, j--);
        }

        A[start] = A[j];
        A[j] = pivot;
        return j;
    }

    static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}