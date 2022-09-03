import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String[] arr = new String[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()) {
            arr[count] = st.nextToken();
            count++;
        }
        String A = arr[0];
        String B = arr[1];

        StringBuilder reA = new StringBuilder();
        StringBuilder reB = new StringBuilder();
        
        for (int i = 2; i >= 0; i--) {
            reA.append(A.charAt(i));
            reB.append(B.charAt(i));
        }
        
        int answer = Integer.parseInt(reA.toString()) > Integer.parseInt(reB.toString()) ? Integer.parseInt(reA.toString()) : Integer.parseInt(reB.toString());
        System.out.println(answer);
    }
}
