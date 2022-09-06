package sorts;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/168
		 */		
		
		int[] testS = {10, 200, 30, 450, 22, 1, 324, 123123, 2344};
		
		selection_sort(testS);
		
		System.out.println(Arrays.toString(testS));
	}
	
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	private static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			int min_index = i;	
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 찾은 최솟값을 서로 교환 
			swap(a, min_index, i);
		}

	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
