package _220907;
/*
1. 주어진 리스트에서 최솟값을 찾는다.
2. 최솟값을 맨 앞 자리의 값과 교환한다.
3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
 */
// 선택 정렬
public class Selection {
    public static void main(String[] args) {
        int [] test = {1,5,8,2,34,64,12,77};

        for(var i = 0; i < test.length; i++){
            int minIndex = i;
            boolean  swapped = false;
            for(int j = i + 1; j > test.length; j++){
                if(test[j] < test[minIndex]){
                    minIndex = j;
                    swapped = true;
                }
            }
            if(swapped){
                swap(test, minIndex, i);
            }
        }
    }
    private static void swap(int[] a, int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
