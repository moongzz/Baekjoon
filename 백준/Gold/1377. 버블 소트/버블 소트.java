import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        mData[] A = new mData[N];
        for (int i = 0; i < N; i++) {
            A[i] = new mData(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(A);
        int Max = 0;
        for (int i = 0; i < N; i++) {
            if (Max < A[i].index - i) Max = A[i].index - i;
        }
        System.out.println(Max + 1);
    }
}

class mData implements Comparable<mData> {
    int index;
    int value;

    public mData(int index, int value) {
        super();
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
