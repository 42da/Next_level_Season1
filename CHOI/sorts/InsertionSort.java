package sorts;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/179
		 * 
		 * 삽입 정렬은 현재 비교하고자 하는 target(타겟)과 그 이전의 원소들과 비교하며 자리를 교환(swap)하는 정렬 방법
		 */

		int[] testI = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		insertion_sort(testI);
		
		System.out.println(Arrays.toString(testI));

	}
	
	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	private static void insertion_sort(int[] a, int size) {
			
		for(int i = 1; i < size; i++) {
			// 타겟 넘버
			int target = a[i];
			
			int j = i - 1;
			
			// 타겟이 이전 원소보다 크기 전 까지 반복
			while(j >= 0 && target < a[j]) {
				a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j--;
			}
			
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + 1 에 위치하게 된다.
			 */
			a[j + 1] = target;	
		}
		
	}

}
