package _220907.Sort;

public class QuickSort {
    static int count = 0;
    public int[] Sort(int[] intArr){
        Recursive1(intArr, 0, intArr.length-1); // 재귀함수 최초 시작
        
        String result = "[";
        for(int k=0;k<intArr.length;k++){ // 결과 담기
            result+=intArr[k];
            if(k!=intArr.length-1){ // 콤마는 마지막에 X
                result+=", ";
            }
        }
        result+="]";
        System.out.println(result); // 결과 출력

        return intArr; // 함수니까 리턴은 있어야지
    }

    public static void Recursive1(int[] intArr, int low, int high) { // 피벗 구해서 분할
        if(low >= high) { // high보다 low가 크면 수행X
            return;
        }
        int pivot = Recursive2(intArr, low, high); // 피벗(중간) 구하기
        Recursive1(intArr, low, pivot); // 피벗보다 왼쪽 수행
        Recursive1(intArr, pivot+1, high); // 피벗보다 오른쪽 수행
    }

    public static int Recursive2(int[] intArr, int leftIdx, int RightIdx){ // 여기서 sort
        int low = leftIdx-1; // 왼쪽 끝에서 1 빼야함 (두와일때문에)
        int high = RightIdx+1; // 오른쪽 끝에서 1 더해야함(두와일때문에)
        int pivot = intArr[(low+high)/2]; // 중간지점을 피벗으로 설정
        int temp; // 교체할때 임시 변수

        while(true) { // return 까지 루프
            do {
                low++; // 일단 low 1증가
            } while(intArr[low] < pivot); // low위치 값이 피벗보다 작으면 반복, 크면 low값 확정

            do {
                high--; // 일단 high 1감소
            } while(intArr[high] > pivot && low <= high); // high위치 값이 pivot보다 크고 && high가 low보다 크거나 같으면 반복
            // 위의 역이 high값 확정 (high가 low보다 크거나 high위치 값이 피벗보다 작아야함)
            
            if(low >= high) { // low가 high보다 크면 안바꾸고 high 리턴
                return high;
            }
            
            temp = intArr[low]; // 교체 
            intArr[low] = intArr[high];
            intArr[high] = temp;
        }
    }
}
