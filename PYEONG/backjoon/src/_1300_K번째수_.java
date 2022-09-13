import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.Arrays;

public class _1300_K번째수_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        int[] B = new int[N * N];
        for (int n = 0; n < N * N; n++) {
            B[n] = (((n / N) + 1) * ((n % N) + 1));
        }
        Arrays.sort(B);
        System.out.println(B[K]);
    }
}
