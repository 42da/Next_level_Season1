import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2455 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int answer = 0;
        int curr = 0;
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Integer[] arr = new Integer[st.countTokens()];
            int count = 0;
            while(st.hasMoreTokens()) {
                arr[count] = Integer.parseInt(st.nextToken());
                count++;
            }
            if (i == 0) {
                answer = arr[1];
                curr = arr[1];
            } else if (i == 3) {
                System.out.println(answer);
            } else {
                curr += arr[1] - arr[0];
                answer = curr > answer ? curr : answer;
            }
            
        }
    }
}
