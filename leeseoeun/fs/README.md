- **BFS (Breadth-First Search)**<br>
    - 너비 우선 탐색
    ![BFS](https://upload.wikimedia.org/wikipedia/commons/5/5d/Breadth-First-Search-Algorithm.gif)
        - *출처 https://developer-mac.tistory.com/64*
    <br><br>
    - 인접한 노드를 먼저 탐색
    - 방문한 노드를 체크
        - 선입선출(FIFO) 사용
        - 즉, 큐(Queue) 사용
            1. 시작 노드를 큐에 넣음 [1]
            2. 시작 노드를 큐에서 꺼낸 후 []<br>
            시작 노도의 인접 노드를 넣음 [2, 3, 4]
            3. 첫번째 노드를 큐에서 꺼낸 후 [3, 4]<br>
            첫번째 노드의 인접 노드를 넣음 [3, 4, 5]
            4. 반복
    - 최단 경로, 임의 경로를 찾고 싶을 때 사용

<br>

- **DFS (Depth-First Search)**<br>
    - 깊이 우선 탐색
    ![DFS](https://upload.wikimedia.org/wikipedia/commons/7/7f/Depth-First-Search.gif)
        - *출처 https://developer-mac.tistory.com/64*
    <br><br>
    - 노드의 분기 탐색 후 다음 노드의 분기 탐색
    - 방문한 노드를 체크
        - 순환 호출 사용
        - 스택(Stack) 사용
    - 모든 노드를 탐색하고 싶을 때 사용
    