package _220907.Sort;

public class ShellSort {
    static int[] gapArr = { 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937,
                            8858, 19930, 44842, 100894, 227011, 510774,
                            1149241, 2585792, 5818032, 13090572, 29453787,
                            66271020, 149109795, 335497038, 754868335, 1698453753};
    static int count = 1;
    public int[] Sort(int[] intArr){
        System.out.println("------셸정렬 수행------");
        int gap = 0; // gap index 변수
        int length = (int)(intArr.length / 2.25); // 갭 시퀀스 2.25배로 나누기

        while (gapArr[gap] < length) { // 첫 갭 인덱스 찾기
            gap++;
        }
        System.out.println("시작갭:"+gapArr[gap]);

        for (int i = gap; i >= 0; i--) {
            String result = "["; // 회차별 결과 변수
            System.out.println("------"+count+"회차(갭:"+gapArr[i]+")------"); // 회차 알려줌
            for (int j = 0; j < gapArr[i]; j++) {	// 부분 리스트에 대해
                InsertionSort(intArr, j, gapArr[i]); // 삽입정렬 수행
            }
            for(int k=0;k<intArr.length;k++){ // 회차별 결과 출력준비
                result+=intArr[k];
                if(k!=intArr.length-1){ // 콤마는 마지막에 X
                    result+=", ";
                }
            }
            result+="]";
            System.out.println(result);
            System.out.println("------------------"); // 결과 출력
            count++;
        }

        return intArr; // 함수니까 리턴은 있어야지
    }

    public static void InsertionSort(int[] intArr, int start, int gap){ // 삽입정렬 수행
        for (int i = start + gap; i < intArr.length; i += gap) { // gap 차이만큼 뛰어서 수행
            int target = intArr[i]; // 타겟변수
            int j = i - gap; // i-gap은 처음 시작때 gap 추가해주기때문에

            while (j >= start && target < intArr[j]) { // 타겟 > 이전값 까지 반복
                intArr[j + gap] = intArr[j]; // 이전 원소를
                j -= gap; // 한 칸씩 뒤로 미뤄서 수행
            }

            intArr[j + gap] = target; // 이전값 < 타겟 이므로 j+gap위치에 target 존재
        }
    }
}
