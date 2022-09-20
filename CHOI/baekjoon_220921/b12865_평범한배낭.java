package baekjoon_220921;

import java.io.IOException;
import java.util.Scanner;

public class b12865_평범한배낭 {

	public static void main(String[] args) throws IOException {
		// 9095번 
		// 1, 2, 3 더하기
		// https://www.acmicpc.net/problem/9095
		
		// 문제
		/*
			정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

			1+1+1+1
			1+1+2
			1+2+1
			2+1+1
			2+2
			1+3
			3+1
			
			정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
		*/
		
		// 입력
		/*
			첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
			각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. 
			n은 양수이며 11보다 작다.
		*/
		
		// 출력
		/*
		 	각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
		*/
			
		// 예제 입력
		/* 
			3
			4
			7
			10
		*/
		
		// 답
		/* 
		 	7
			44
			274
		*/
		
		
		// POINT
		// 우선 1, 2, 3을 만들 수 있는 경우의 수를 만들어야 함 
		// 1 = {1}로 한 개, 
		// 2 = {1+1, 2}로 2개, 
		// 3 = {1+1+1, 1+2, 2+1, 3}으로 4개이다.
		// d[4]를 생각할 때

		// 4는 1 + 3 이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 4가지이다.
		// 4는 2 + 2이다. 2를 1, 2, 3 더하기로 하였을 때의 경우의 수는 2가지이다.
		// 4는 3 + 1이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 1가지이다.
		// 즉, 4 + 2 + 1을 하면 7가지가 된다.
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] array = new int[11];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		

		int a = 0;
		for(int i = 0; i < num; i++) {
			a = sc.nextInt();
			for(int j = 4; j <= a; j++) {
				array[j] = array[j - 1] + array[j - 2] + array[j - 3];
			}
			System.out.println(array[a]);
		}
		
		sc.close();

	}
	
	// 정답: https://fbtmdwhd33.tistory.com/73
}
