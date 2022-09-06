package _220907.Sort;

public class SelectionSort {
    public int[] Sort(int[] intArr){
        System.out.println("------선택정렬 수행------");
        int min; // 최소값 변수
        int idx; // 인덱스 변수
        String result = "["; // 회차별 결과 변수
        for(int i = 0; i < intArr.length - 1; i++) {
            System.out.println("------"+(i+1)+"회차------"); // 회차 알려줌
            min = intArr[i]; // 최소값은 수행하지 않은 처음 idx
            idx = i; // 최소 idx는 수행하지 않은 처음 idx
            for(int j = i + 1; j < intArr.length; j++) { // 남은 arr 횟수만큼 돌기
                if(intArr[j] < min) { // 최소값 찾기
                    min = intArr[j]; // 최소값이랑
                    idx = j; // 최소값 위치 저장
                }
            }

            intArr[idx] = intArr[i]; // 교체
            intArr[i] = min; // 교체
            for(int k=0;k<intArr.length;k++){ // 회차별 결과 출력준비
                result+=intArr[k];
                if(k!=intArr.length-1){ // 콤마는 마지막에 X
                    result+=", ";
                }
            }
            result+="]";
            System.out.println(result);
            System.out.println("------------------"); // 결과 출력
            result = "["; // 결과 초기화
        }

        return intArr; // 함수니까 리턴은 있어야지
    }
}
