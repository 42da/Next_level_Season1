package _220907;

/*1. 앞에서부터 현재 원소와 바로 다음의 원소를 비교한다.
  2. 현재 원소가 다음 원소보다 크면 원소를 교환한다.
  3. 다음 원소로 이동하여 해당 원소와 그 다음원소를 비교한다.
 */

// 버블 정렬
public class Bubble {
    public static void main(String[] args) {
        int [] test = {1,5,8,2,34,64,12,77};

        // 라운드 크기
        for(int i = 1; i < test.length; i++) {
            boolean swapped = false;
            int size = test.length;
            // 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
            for(int j = 0; j < size - i; j++) {
                /*
                 *  현재 원소가 다음 원소보다 클 경우
                 *  서로 원소의 위치를 교환하고
                 *  비교수행을 했다는 표시로 swapped 변수를 true로 변경한다.
                 */
                if(test[j] > test [j + 1]) {
                    swap(test, j, j + 1);
                    swapped = true;
                }
            }

            /*
             * 만약 swap된적이 없다면 이미 정렬되었다는 의미이므로
             * 반복문을 종료한다.
             */
            if(swapped == false) {
                break;
            }
        }
    }
    private static void swap(int[] a, int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
