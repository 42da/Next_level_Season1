import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Comparator;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class _2693 {
    public static void main(String[] args) throws Exception {
        // 배열 입력
        //    Scanner sc = new Scanner(System.in);
        //    String str = sc.nextLine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 줄 개수
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < number; i++) {

            // String -> int
            int[] numArr = new int[10];

            String str = br.readLine();
            String[] strArr = str.split(" "); // StringTokenizer
            for (int j = 0; j < 10; j++) {
                numArr[j] = Integer.parseInt(strArr[j]);
            }

            // 정답 출력
            Arrays.sort(numArr);
            System.out.print(numArr[7]);
            // bw.write(numArr[7]);
            //sb.append(numArr[7] + "\n");
        }

        //System.out.println(sb);
        //new _2693().solution();
    }

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int answer[] = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Integer[] arr = new Integer[st.countTokens()];
            int count = 0;
            while(st.hasMoreTokens()) {
                arr[count] = Integer.parseInt(st.nextToken());
                count++;
            }
            sb.append(solutionLogic(arr)).append('\n');
        
        }
        System.out.println(sb);
    }

    public int solutionLogic(Integer[] arr) throws Exception {
        int answer = 0;
        // int _max = arr[0];
        // int _len = arr.length;
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 1; j < _len; j++) {
        //         if (_max < arr[j]) {
        //             _max = arr[j];
        //         }
        //     }
        // }
        Arrays.sort(arr, Collections.reverseOrder());
        answer = arr[2];
        return answer;
    }
}
