import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.StringTokenizer;
import java.util.Arrays;

public class _1300_K번째수_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());
        // int[] B = new int[N * N];
        // for (int n = 0; n < N * N; n++) {
        //     B[n] = (((n / N) + 1) * ((n % N) + 1));
        // }
        // Arrays.sort(B);
        // System.out.println(B[K]);
        
        /* 
        // 틀림
        long left = 1, right = N * N, answer = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }
            if (cnt < K) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }
        System.out.println(answer);
        */
        long left = 1, right = K, answer = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;
            for (int i = 1; i <= N; i++) {
                cnt += Math.min(mid / i, N);
            }
            if (cnt < K) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
