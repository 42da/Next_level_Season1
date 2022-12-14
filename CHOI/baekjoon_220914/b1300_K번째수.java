package baekjoon_220914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b1300_K번째수 {

public static void main(String[] args) throws IOException {
		
		// 1300번 
		// K번째 수
		// https://www.acmicpc.net/problem/1300
		
		// 문제
		/*
			세준이는 크기가 N×N인 배열 A를 만들었다. 
			배열에 들어있는 수 A[i][j] = i×j 이다. 
			이 수를 일차원 배열 B에 넣으면 B의 크기는 N×N이 된다. 
			B를 오름차순 정렬했을 때, B[k]를 구해보자.

			배열 A와 B의 인덱스는 1부터 시작한다.
		*/
		
		// 입력
		/*
			첫째 줄에 배열의 크기 N이 주어진다. 
			N은 105보다 작거나 같은 자연수이다. 
			둘째 줄에 k가 주어진다. 
			k는 min(109, N2)보다 작거나 같은 자연수이다.
		*/
		
		// 출력
		/*
		 	B[k]를 출력한다.
		*/
			
		// 예제 입력
		/* 
			3
			7
		*/
		
		// 답
		/* 
		 	6
		*/
		
		
		
		// POINT
		// 크기가 N×N인 배열 A를 만들었다. 
		// 배열에 들어있는 수 A[i][j] = i×j 이다. 
		// 이 수를 일차원 배열 B에 넣으면 B의 크기는 N×N이 된다. 
		// B를 오름차순 정렬했을 때, B[k]를 구해보자????????????
		
		// 첫째 줄에 배열의 크기 N 
		// N은 105보다 작거나 같은 자연수이다. 
		// 둘째 줄에 k 
		// k는 min(109, N2)보다 작거나 같은 자연수

		
		// 문제의 본질은 다음과 같다. A[i][j] = i * j 로 이루어져있는 행렬들을 
		// 1차원 배열 B로 만들 때 B[k]의 값은 무엇인지를 찾는 문제다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		// x는 lo <= x <= hi 의 범위를 갖는다.
		long lo = 1;
		long hi = K;
		
		// lower-bound
		while(lo < hi) {
			
			long mid = (lo + hi) / 2;	// 임의의 x(mid)를 중간 값으로 잡는다.
			long count = 0;
			
			/*
			 *  임의의 x에 대해 i번 째 행을 나눔으로써 x보다 작거나 같은 원소의 개수
			 *  누적 합을 구한다.
			 *  이 때 각 행의 원소의 개수가 N(열 개수)를 초과하지 않는 선에서 합해주어야 한다.   
			 */
			for(int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			
			// count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
			if(K <= count) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
		}
		
		System.out.println(lo);

	}
	
	// 정답: https://st-lab.tistory.com/281

}
