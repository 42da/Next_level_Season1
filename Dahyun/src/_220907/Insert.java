package _220907;
/*
1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
 */
// 삽입 정렬
public class Insert {
    public static void main(String[] args) {
        int [] test = {1,5,8,2,34,64,12,77};

        for(var i = 1; i < test.length; i++){
            int target = test[i];
            for(int j = i - 1; j >= 0; j--){
                if(test[j] > target){
                    swap(test, j, j+1);
                }else{
                    break;
                }
            }
        }
    }
    private static void swap(int[] a, int i,int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
