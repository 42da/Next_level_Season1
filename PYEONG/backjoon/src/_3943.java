import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3943 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int _max = n;
            while(n > 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n  = n * 3 + 1;
                }
                _max = n > _max ? n : _max;
            }
            sb.append(n).append('\n');
        }
        System.out.println(sb);
    }
}
