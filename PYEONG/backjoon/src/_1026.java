import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class _1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        
        int n = Integer.parseInt(br.readLine());
        Integer[] A = new Integer[n];
        Integer[] B = new Integer[n];
        for (int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int count = 0;
            while(st.hasMoreTokens()) {
                if (i == 0) A[count] = Integer.parseInt(st.nextToken());
                else B[count] = Integer.parseInt(st.nextToken());
                count++;
            }

        }
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += A[i] * B[i];
        }
        System.out.println(answer);
    }
}
