import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MaxHeap maxHeap = new MaxHeap(N);
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                System.out.println(maxHeap.remove());
            } else {
                maxHeap.insert(x);
            }
        }
    }
}

class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int N) {
        heap = new int[N + 1];
        size = 0;
    }

    public void insert(int x) {
        heap[++size] = x;
        heapifyUp(size);
    }

    public int remove() {
        if (size == 0) return 0;

        int max = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return max;
    }

    private void heapifyUp(int i) {
        while (i > 1 && heap[i] > heap[i / 2]) {
            swap(i, i / 2);
            i /= 2;
        }
    }

    private void heapifyDown(int i) {
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if (left <= size && heap[left] > heap[largest]) largest = left;
        if (right <= size && heap[right] > heap[largest]) largest = right;

        if (largest != i) {
            swap(i, largest);
            heapifyDown(largest);
        }
    }

    private void swap(int a, int b) {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
}