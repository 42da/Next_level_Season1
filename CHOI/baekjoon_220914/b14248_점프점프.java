package baekjoon_220914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b14248_점프점프 {
	
	static int n;
    static int check[]; // 방문 완료
    static int bridge[]; // 돌다리
    static int dir[] = {1, -1}; // 왼쪽 방향, 오른쪽 방향
    static int cnt = 1; // 시작 지점도 방문한 것이니 1로 초기화

public static void main(String[] args) throws IOException {
		
		// 14248번 
		// 점프 점프
		// https://www.acmicpc.net/problem/14248
		
		// 문제
		/*
			영우는 개구리다 개굴개굴개굴

			영우는 지금 n개의 돌이 일렬로 놓여있는 돌다리에 있다. 
			그리고 돌다리의 돌에는 숫자가 하나씩 적혀있다. 
			영우는 이 숫자가 적혀있는 만큼 왼쪽이나 오른쪽으로 점프할 수 있는데, 이때 돌다리 밖으로 나갈 수는 없다.
			
			영우는 이 돌다리에서 자기가 방문 가능한 돌들의 개수를 알고 싶어한다. 
			방문 가능하다는 것은 현재위치에서 다른 돌을 적절히 밟아 해당하는 위치로 이동이 가능하다는 뜻이다.
			
			현재 위치가 주어졌을 때, 영우가 방문 가능한 돌들의 개수를 출력하시오.
		*/
		
		// 입력
		/*
			첫 번째 줄에는 돌다리의 돌 개수 n이 주어진다.(1≤n≤100,000) 
			돌의 번호는 왼쪽부터 1번에서 n번이다. 
			다음 줄에는 그 위치에서 점프할 수 있는 거리 Ai가 주어진다.(1≤Ai≤100,000)

			다음 줄에는 출발점 s가 주어진다.(1≤s≤n)
		*/
		
		// 출력
		/*
		 	영우가 방문 가능한 돌들의 개수를 출력하시오.
		*/
			
		// 예제 입력
		/* 
			5
			1 4 2 2 1
			3
		*/
		
		// 답
		/* 
		 	5
		*/
		
		
		
		// POINT
		// 숫자가 적혀있는 만큼 왼쪽이나 오른쪽으로 점프할 수 있는데, 이때 돌다리 밖으로 나갈 수는 없다.
		// 자기가 방문 가능한 돌들의 개수???
		
		// 돌의 번호는 왼쪽부터 1번에서 n번
		// 다음 줄에는 그 위치에서 점프할 수 있는 거리 Ai
		// 다음 줄에는 출발점 s
		
		// 현재 위치가 주어졌을 때, 영우가 방문 가능한 돌들의 개수를 출력
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bridge = new int[n]; 
        check = new int[n]; 
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 돌다리 담기
        for (int i = 0; i < n; i++) {
            bridge[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine()); // 시작지점
        System.out.println(bfs(s-1)); // 배열 인덱스는 s-1

	}
	
	public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        check[node] = 1; // 방문한 곳 체크
        
        while (!queue.isEmpty()) {
            node = queue.poll();
            int jump = bridge[node];
            for (int d : dir) {
                int direction = (d * jump) + node;
                if (direction >= 0 && direction < n && check[direction] == 0) {
                    check[direction] = 1;
                    queue.offer(direction);
                    cnt++;
                }
            }
        }
        return cnt;
    }
	
	
	// 정답: https://connie.tistory.com/m/16

}
