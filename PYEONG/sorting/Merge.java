public class Merge {
    public static int[] sortedArr = {0, 0, 0, 0, 0, 0};
    
    public static void main(String[] args) throws Exception {
        int[] targetArr = {4, 1, 2, 5, 3, 6};
        mergeSort(targetArr, 0, targetArr.length - 1);
        for (int i = 0; i < targetArr.length; i++) {
            System.out.println(targetArr[i]);
        }
    }
    public static void mergeSort(int[] targetArr, int l, int r) {
        if (r > l) {
            int m = (r + l) / 2;
            mergeSort(targetArr, l, m);
            mergeSort(targetArr, m + 1, r);
            merge(targetArr, l, m, r);
        }
    }
    public static void merge(int[] targetArr, int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = l;      // 새로 정렬할 배열의 index

        while (i <= m && j <= r) {
            if (targetArr[i] < targetArr[j]) {
                sortedArr[k++] = targetArr[i++];
            }
            else {
                sortedArr[k++] = targetArr[j++];
            }
        }
        if (i > m) {    // 왼쪽이 먼저 끝남. 오른쪽 배열 추가
            for (int rest = j; rest <= r; rest++) {
                sortedArr[k++] = targetArr[rest];
            }
        }
        else {
            for (int rest = i; rest < m + 1; rest++) {
                sortedArr[k++] = targetArr[rest];
            }
        }
        for (int idx = l; idx <= r; idx++) {
            targetArr[idx] = sortedArr[idx];
        }
    }
}
