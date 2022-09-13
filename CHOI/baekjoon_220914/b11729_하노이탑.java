package baekjoon_220914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b11729_하노이탑 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		// 11729번 
		// 하노이 탑 이동 순서
		// https://www.acmicpc.net/problem/11729
		
		// 문제
		/*
			세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 
			각 원판은 반경이 큰 순서대로 쌓여있다. 
			이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

			한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
			쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
			이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.
			
			아래 그림은 원판이 5개인 경우의 예시이다.
		*/
		
		// 입력
		/*
			첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)이 주어진다.
		*/
		
		// 출력
		/*
		 	첫째 줄에 옮긴 횟수 K를 출력한다.
			두 번째 줄부터 수행 과정을 출력한다. 
			두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 
			이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
		*/
			
		// 예제 입력
		/* 
			3
		*/
		
		// 답
		/* 
		 	7
			1 3
			1 2
			3 2
			1 3
			2 1
			2 3
			1 3
		*/
		
		
		
		// POINT
		// 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 
		// 각 원판은 반경이 큰 순서대로 쌓여 
		// 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
		
		// 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
		// 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
		// 단, 이동 횟수는 최소가 되어야 한다.
		
		// 첫째 줄에 옮긴 횟수 K를 출력한다.
		// 두 번째 줄부터 수행 과정을 출력한다. 
		// 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데, 
		// 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.

		
		// 재귀를 통해 '가장 작은 단위' 가 될 때 까지 재귀호출을 하고, 
		// 가장 작은 단위까지 호출이 되었으면, 거기서 구현한 연산을 실행하면 된다.
		// 하노이탑 개수와 상관없이, 일정 규칙을 찾고, 최소 단위를 생각

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);

	}
	
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
	public static void Hanoi(int N, int start, int mid, int to) {
		// 이동할 원반의 수가 1개라면?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
 
		// A -> C로 옮긴다고 가정할 떄,
		// STEP 1 : N-1개를 A에서 B로 이동 (= start 지점의 N-1개의 원판을 mid 지점으로 옮긴다.)
		Hanoi(N - 1, start, to, mid);
    
		// STEP 2 : 1개를 A에서 C로 이동 (= start 지점의 N번째 원판을 to지점으로 옮긴다.)
		sb.append(start + " " + to + "\n");
    
		// STEP 3 : N-1개를 B에서 C로 이동 (= mid 지점의 N-1개의 원판을 to 지점으로 옮긴다.)
		Hanoi(N - 1, mid, start, to);
	}
	
	// 정답: https://st-lab.tistory.com/281
	// - 방법 3 : [ BufferedReader + StringBuilder() ] 
	// 입력에서 시간을 가장 단축 할 수 있는 방법 중 하나다. 
	// 백준에서 Scanner 는 한 번만 입력받더라도 기본 수행시간이 100ms 를 넘어간다.
	// 그렇기 때문에 대부분 각 문제별로 Java 제출자 중 시간이 상위권인 분들은 BufferedReader 을 많이 사용한다.
	// 특히 형 변환 해줄 때 유의하셔야 한다.
}
