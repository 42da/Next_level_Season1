import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1735 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4];
        int count = 0;
        for (int n = 0; n < 2; n++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()) {
                arr[count++] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        int x = (arr[0] * arr[3]) + (arr[1] * arr[2]);  // 분자 합
        int y = arr[1] * arr[3];                        // 분모 합
        sb.append(x / gcd(x, y)).append(" ").append(y / gcd(x, y));
        System.out.println(sb);
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}
