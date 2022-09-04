public class Selection {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 100, 2, 3, 2};
        int arrLen = arr.length;
        for (int i = 0; i < arrLen; i++) {      // 마지막 숫자는 자동정렬이기 때문에 arrLen - 1 만큼 반복
            int _min = arr[i];
            int _minIdx = i;
            
            for (int j = i + 1; j < arrLen; j++) {
                if (arr[j] < _min) {
                    _min = arr[j];
                    _minIdx = j;
                }
            }
            if (_minIdx != i) {
                arr[_minIdx] = arr[i];
                arr[i] = _min;
            }
        }
        for (int idx = 0; idx < arrLen; idx++) {
            System.out.println(arr[idx]);
        }
    }
}