import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11650 {
    public static int[][] sortedArr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sortedArr = new int[n][2];
        int[][] arr;
        arr = new int[n][2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            while(st.hasMoreTokens()) {
                arr[count][0] = Integer.parseInt(st.nextToken());
                arr[count][1] = Integer.parseInt(st.nextToken());
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        mergeSort(arr, 0, n - 1);
        for (int j = 0; j < n; j++) {
            sb.append(sortedArr[j][0]).append(" ").append(sortedArr[j][1]).append('\n');
        }
        System.out.println(sb);
    }
    public static void mergeSort(int[][] targetArr, int l, int r) {
        if (r > l) {
            int m = (r + l) / 2;
            mergeSort(targetArr, l, m);
            mergeSort(targetArr, m + 1, r);
            merge(targetArr, l, m, r);
        }
    }
    public static void merge(int[][] targetArr, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = l;      // 새로 정렬할 배열의 index

        while (i <= m && j <= r) {
            if (targetArr[i][0] < targetArr[j][0]) {
                sortedArr[k][0] = targetArr[i][0];
                sortedArr[k++][1] = targetArr[i++][1];
            }
            else if (targetArr[i][0] == targetArr[j][0]) {
                if (targetArr[i][1] < targetArr[j][1]) {
                    sortedArr[k][0] = targetArr[i][0];
                    sortedArr[k++][1] = targetArr[i++][1];
                }
                else {
                    sortedArr[k][0] = targetArr[j][0];
                    sortedArr[k++][1] = targetArr[j++][1];
                }
            }
            else {
                sortedArr[k][0] = targetArr[j][0];
                sortedArr[k++][1] = targetArr[j++][1];
            }
        }
        if (i > m) {    // 왼쪽이 먼저 끝남. 오른쪽 배열 추가
            for (int rest = j; rest <= r; rest++) {
                sortedArr[k][0] = targetArr[rest][0];
                sortedArr[k++][1] = targetArr[rest][1];
            }
        }
        else {
            for (int rest = i; rest < m + 1; rest++) {
                sortedArr[k][0] = targetArr[rest][0];
                sortedArr[k++][1] = targetArr[rest][1];
            }
        }
        for (int idx = l; idx <= r; idx++) {
            targetArr[idx][0] = sortedArr[idx][0];
            targetArr[idx][1] = sortedArr[idx][1];
        }
    }
}
