package sorts;

public class ShellSort {

	public static void main(String[] args) {
		
		/*
		 * https://st-lab.tistory.com/209
		 * 
		 *  

			셸 정렬의 전체적인 과정은 이렇다. (오름차순을 기준으로 설명)
			
			 
			
			1. 간격(gap)을 설정한다.
			
			2. 각 간격별로 분류 된 서브(부분) 리스트에 대해 삽입정렬을 한다.
			
			3. 각 서브(부분) 리스트의 정렬이 끝나면 간격을 줄인다.
			
			4. 간격이 1이 될 때 까지 2번 과정으로 되돌아가며 반복한다.
			
			간격 설정??? 갭 시퀀스(Gap Sequences)
			현재까지 알려진 gap sequence들 중 가장 좋은 퍼포먼스가 좋은 Ciura 시퀀스를 사용
		 */
	}
	
	private final static int[] gap = 
		{ 1, 4, 10, 23, 57, 132, 301, 701, 1750, 3937, 	
		8858, 19930, 44842, 100894, 227011, 510774,
		1149241, 2585792, 5818032, 13090572, 29453787, 
		66271020, 149109795, 335497038, 754868335, 1698453753};	// 갭을 담고있는 배열	
 
	
	public static void shell_sort(int[] a) {
		shell_sort(a, a.length);
		
	}
 
	// 맨 처음 gap을 참조 할 인덱스를 구하는 메소드
	private static int getGap(int length) {
		int index = 0;
		// 최소한 부분 배열의 원소가 2개씩은 비교 되도록 나눠준다.
		int len = (int)(length / 2.25);	
		while (gap[index] < len) {
			index++;
		}
		return index;
	}
 
	private static void shell_sort(int[] a, int size) {
		int index = getGap(size);	// 첫 gap을 사용할 index
 
		// gap[index] 값부터 gap[0] 까지 반복한다.
		for (int i = index; i >= 0; i--) {
 
			for (int j = 0; j < gap[i]; j++) {	// 각 부분 리스트에 대해 삽입정렬을 한다.
				insertion_sort(a, j, size, gap[i]);
			}
		}
	}
 
	/**
	 * 
	 * @param a		 배열
	 * @param start	 부분 배열의 첫 번째 원소 인덱스 
	 * @param size	 배열의 전체 크기
	 * @param gap	 현재 gap
	 */
	private static void insertion_sort(int[] a, int start, int size, int gap) {
 
		// 부분 배열의 두 번째 원소부터 size까지 반복한다. (gap 값씩 건너띔) 
		for (int i = start + gap; i < size; i += gap) {
 
			int target = a[i];
			int j = i - gap;
 
			// 타겟 원소가 이전의 원소보다 작을 때 까지 반복 
			while (j >= start && target < a[j]) {
				a[j + gap] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
				j -= gap;
			}
			/*
			 * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야한다.
			 * 그러므로 타겟은 j + gap 에 위치하게 된다.
			 */
			a[j + gap] = target;
 
		}
	}

}
