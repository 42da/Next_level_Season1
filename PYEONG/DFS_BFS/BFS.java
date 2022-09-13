package DFS_BFS;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class BFS {
    public static ArrayList<Integer[]> graph = new ArrayList<Integer[]>();
    public static Queue<Integer[]> visitQueue = new LinkedList<Integer[]>();
    public static int[] visited = new int[9];
    public static void main(String[] args) throws Exception {
        graph.add(new Integer[]{-99999});           // 노드 번호(index) 1번부터 처리하기 위한 임시 숫자
        graph.add(new Integer[]{2, 3, 8});          // 노드 번호 1에서 갈 수 있는 노드(1 -> 2, 1 -> 3, 1 -> 8)
        graph.add(new Integer[]{1, 7});
        graph.add(new Integer[]{1, 4, 5});
        graph.add(new Integer[]{3, 5});
        graph.add(new Integer[]{3, 4});
        graph.add(new Integer[]{7});
        graph.add(new Integer[]{2, 6, 8});
        graph.add(new Integer[]{1, 7});

        int idx = 1;                                // 시작 노드 번호 1
        visitQueue.add(graph.get(1));        // 방문한 노드에서 갈 수 있는 노드들을 queue 에 추가
        visited[idx] = 1;                           // 방문처리
        System.out.println(1);
        while (!visitQueue.isEmpty()) {             //  queue 가 빌 때까지 반복
            Integer[] node = visitQueue.poll();     // 현재 노드에서 갈 수 있는 노드들 뽑아옴
            for (int i = 0 ; i < node.length; i++) {    // 갈 수 있는 노드 만큼 반복
                if (visited[node[i]] == 0) {            // 방문하지 않은 노드일 경우
                    visited[node[i]] = 1;               // 방문처리
                    visitQueue.add(graph.get(node[i])); // 앞으로 방문할 노드에서 갈 수 있는 노드 배열을 queue에 추가
                                                        /*
                                                         현재 노드 번호 : 1
                                                         1에서 갈 수 있는 노드(앞으로 방문할 노드) : 2, 3, 8
                                                         앞으로 방문할 노드에서 갈 수 있는 노드 배열: 2 -> {1, 7}
                                                                                            3 -> {1, 4, 5}
                                                                                            8 -> {1, 7}
                                                                                                 위 세 배열을 queue에 추가
                                                            위 과정 수행 시 2, 3, 8 먼저 방문처리되고 다음 반복때는 {1, 7}에 대해 같은 과정 수행
                                                         */
                    System.out.println(node[i]);
                }
            }
            // if (visited[idx] == 1) {
            //     continue;
            // } else {
            //     visited[idx] = 1;
            //     for (int i = 0; i < node.length; i++) {
            //         visited[node[i]] = 1;
            //         visitQueue.add(new Integer[]{node[i]});
            //         System.out.println(node[i]);
            //     }
            // }
        }
    }
    // public static void bfs(ArrayList<Integer[]> graph, int node) {
    //     if (visited[node] == 1) return;
    //     else visited[node] = 1;
    //     System.out.println(node);
    //     for (int i = 0; i < graph.get(node).length; i++) {
            
    //         bfs(graph, graph.get(node)[i]);
    //     }
    // }
}   