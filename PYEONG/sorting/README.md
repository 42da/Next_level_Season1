## Insertion Sort (선택정렬)
특징
- 제자리 정렬: 입력배열 외 추가 메모리 요구하지 않음
- 불안정적: 동일한 키 값의 유지 순서가 정렬 후 유지되지 않음
> [3, 2, 1, <span style="color:red">**5**</span>, 7, *5*] 배열이 있다고 가정 
>  
> 이를 오름차순으로 정렬한다고 할때  
> 
> [1, 2, 3, <span style="color:red">**5**</span>, *5*, 7]이 된다면 안정 정렬
> 
> [1, 2, 3, *5*, <span style="color:red">**5**</span>, 7]이 될 수 있다면 불안정 정렬.
- 시간복잡도: 
  - Best: $O(n^2)$
  - Avg: $O(n^2)$
  - Worst: $O(n^2)$
---
## Selection Sort (삽입정렬)
특징
- 제자리 정렬
- 안정적
- 대부분의 자료가 정렬되어 있는 경우 매우 효율적임.
- 시간복잡도:
  - Best: $O(n)$ -> 이동 없이 비교만 이루어짐.
  - Avg: $O(n^2)$
  - Worst: $O(n^2)$ -> 입력 자료 역순일 경우
---
## Merge Sort (합병정렬)
특징
- 안정적
- 추가 기억장소 필요(제자리 정렬 x)
- 시간복잡도:
  - Best : $O(nlogn)$
  - Avg: $O(nlogn)$
  - Worst: $O(nlogn)$
