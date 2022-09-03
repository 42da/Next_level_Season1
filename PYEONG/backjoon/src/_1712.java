import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1712 {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] arr = new Integer[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()) {
            arr[count] = Integer.parseInt(st.nextToken());
            count++;
        }

        int A = arr[0];
        int B = arr[1];
        int C = arr[2];

        int answer = -1;
        if (C - B > 0) answer = (A / (C - B)) + 1;
        if (answer > 0) System.out.println(answer);
        else System.out.println(-1);
    }
}
