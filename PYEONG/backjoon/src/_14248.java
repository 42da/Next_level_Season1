import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14248 {
    public static int[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        visited = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[st.countTokens()];
        int count = 0;
        while(st.hasMoreTokens()) {
            arr[count] = Integer.parseInt(st.nextToken());
            count++;
        }
        int start = Integer.parseInt(br.readLine());
        search(arr, start - 1);
        int answer = 0;
        for (int i = 0; i < visited.length; i++) {
            answer += visited[i] == 1 ? 1 : 0;
        }
        System.out.println(answer);
    }
    public static void search(int[] arr, int position) {
        if (visited[position] == 0) {                   // 방문하지 않은 돌다리일 경우 방문 표시 +1
            visited[position] = 1;
        } else {                                        // 방문한 돌다리일 경우 빠져나옴(왼쪽, 오른쪽 따로 탐색하기 때문에 더 이상 방문 필요x. 무한루프 방지)
            return;
        }
        if (position - arr[position] >= 0) {            // 왼쪽으로 이동하는데 왼쪽 끝 돌보다 안쪽이면
            search(arr, position - arr[position]);      // 다음 칸 이동
        }
        if (position + arr[position] < arr.length) {    // 오른쪽으로 이동하는데 오른쪽 끝 돌보다 안쪽이면
            search(arr, position + arr[position]);      // 다음 칸 이동
        }
    }
}
