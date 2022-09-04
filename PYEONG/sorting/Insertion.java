public class Insertion {
    public static void main(String[] args) throws Exception {
        int[] targetArr = {4, 1, 3, 5, 2};
        int arrLen = targetArr.length;
        for (int k = 1; k < arrLen; k++) {
            int key = targetArr[k];
            for (int i = k - 1; i >= 0; i--) {          // key 의 왼쪽 값이 key 보다 클 경우 자리 바꿔줌. (key 보다 작은 값은 key 의 index 까지 밀어줌)
                                                        // key 보다 작은 값이 나올 때 까지 반복
                if (targetArr[i] > key) {               
                    targetArr[i + 1] = targetArr[i];
                    targetArr[i] = key;
                }
            }
        }
        for (int i = 0; i < arrLen; i++) {
            System.out.println(targetArr[i]);
        }
    }
}
