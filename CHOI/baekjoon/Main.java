package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 1213번 
		// 팰린드롬 만들기
		// https://www.acmicpc.net/problem/1213
		
		// 문제
		/*
			임한수와 임문빈은 서로 사랑하는 사이이다.
			임한수는 세상에서 팰린드롬인 문자열을 너무 좋아하기 때문에, 둘의 백일을 기념해서 임문빈은 팰린드롬을 선물해주려고 한다.
			임문빈은 임한수의 영어 이름으로 팰린드롬을 만들려고 하는데, 임한수의 영어 이름의 알파벳 순서를 적절히 바꿔서 팰린드롬을 만들려고 한다.
			
			임문빈을 도와 임한수의 영어 이름을 팰린드롬으로 바꾸는 프로그램을 작성하시오.
		*/
		
		// 입력
		/*
			첫째 줄에 임한수의 영어 이름이 있다. 알파벳 대문자로만 된 최대 50글자이다.
		*/
		
		// 출력
		/*
		 	첫째 줄에 문제의 정답을 출력한다. 
		 	만약 불가능할 때는 "I'm Sorry Hansoo"를 출력한다. 정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력한다.
		*/
			
		// 예제 입력
		/* 
			AABB
			
			ABACABA
			
			ABCD
		*/
		
		// 답
		/* 
		 	ABBA
		 	
		 	AABCBAA
		 	
		 	I'm Sorry Hansoo
		*/

		Scanner sc = new Scanner(System.in);
		
		// 팰린드롬??? 역순으로 읽어도 같은 말 ex) eye, madam
		// 정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력
		// 불가능할 때는 "I'm Sorry Hansoo"를 출력
		
		String name = sc.nextLine();
		char[] nameArr = name.toCharArray();
		Arrays.sort(nameArr);  // 알파벳 순으로 정렬
		
		if(nameArr.length%2 == 0) {		// 1. 짝수일 경우  // aaaabbbbcccc
			
		} else {		// 2. 홀수일 경우    // aaabccc
			
		}
		
		
		// 정답 예시
		// https://developer-ellen.tistory.com/91
		
		
		

		
		
		
		
		sc.close();
	}

}
