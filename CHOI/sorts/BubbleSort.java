package sorts;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		/*
		 * <버블 정렬>
		 * 
		 * https://st-lab.tistory.com/195
		 * 
		 * 비교 정렬
		 * 
		 * 앞,뒤 값 비교 후 작은순으로 재정렬 
		 * 
		 * 이 때, 각 라운드를 진행 할 때마다 뒤에서부터 한 개씩 정렬되기 때문에, 라운드가 진행 될 때마다 한 번씩 줄면서 비교하게 된다.
		 * 
		 * 총 라운드는 배열 크기 - 1 번 진행되고,
		 * 
		 * 각 라운드별 비교 횟수는 배열 크기 - 라운드 횟수 만큼 비교한다.
		 */		
		
		
		int[] testB = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		bubble_sort(testB);
		
		System.out.println(Arrays.toString(testB));
	}
	
	public static void bubble_sort(int[] a) {
		bubble_sort(a, a.length);
	}
	
	private static void bubble_sort(int[] a, int size) {
		
		// round는 배열 크기 - 1 만큼 진행됨 
		for(int i = 1; i < size; i++) {
			
			// 각 라운드별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교함
			for(int j = 0; j < size - i; j++) {
				
				/*
				 *  현재 원소가 다음 원소보다 클 경우
				 *  서로 원소의 위치를 교환한다. 
				 */
				if(a[j] > a [j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}
		
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
