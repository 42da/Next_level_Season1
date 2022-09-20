package baekjoon_220921;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b12738_가장긴증가하는부분수열3 {

	public static void main(String[] args) throws IOException {
		// 12738번 
		// 가장 긴 증가하는 부분 수열 3
		// https://www.acmicpc.net/problem/12738
		
		// 문제
		/*
			수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

			예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 
			가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
		*/
		
		// 입력
		/*
			첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.

			둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. 
			(-1,000,000,000 ≤ Ai ≤ 1,000,000,000)
		*/
		
		// 출력
		/*
		 	첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
		*/
			
		// 예제 입력
		/* 
			6
			10 20 10 30 20 50
		*/
		
		// 답
		/* 
		 	4
		*/
		
		
		// POINT
		// 1. 리스트의 마지막 보다 크면 삽입
		// 2. 리스트의 마지막 보다 작으면 리스트 이진 탐색으로 적절한 위치에 삽입
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    ArrayList<Integer> list = new ArrayList<>();

		int n = Integer.parseInt(br.readLine());
		int val = 0;
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < n; i++) {
        	val = Integer.parseInt(st.nextToken());
        	
        	if(list.get(list.size() - 1) < val) {
        		list.add(val);
        	} else {
        		int left = 1;
        		int right = list.size() - 1;
        		
        		while(left < right) {
        			int mid = (left + right) / 2;
        			if(list.get(mid) < val) {
        				left = mid + 1;
        			} else {
        				right = mid;
        			}
        		}
        		list.set(right, val);
        	}
        	
        }

        bw.write((list.size() - 1) + "");
        bw.flush();
        br.close();
        bw.close();

	}
	
	// 정답: https://gre-eny.tistory.com/24
}
