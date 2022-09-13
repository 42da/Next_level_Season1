package DFS_BFS;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class DFS {
    public static ArrayList<Integer[]> graph = new ArrayList<Integer[]>();
    public static int[] visited = new int[9];
    public static void main(String[] args) throws Exception {
        graph.add(new Integer[]{-99999});               // 노드 번호(index) 1번부터 처리하기 위한 임시 숫자
        graph.add(new Integer[]{2, 3, 8});              // 노드 번호 1에서 갈 수 있는 노드(1 -> 2, 1 -> 3, 1 -> 8)
        graph.add(new Integer[]{1, 7});
        graph.add(new Integer[]{1, 4, 5});
        graph.add(new Integer[]{3, 5});
        graph.add(new Integer[]{3, 4});
        graph.add(new Integer[]{7});
        graph.add(new Integer[]{2, 6, 8});
        graph.add(new Integer[]{1, 7});

        dfs(graph, 1);
    }
    public static void dfs(ArrayList<Integer[]> graph, int node) {
        if (visited[node] == 1) return;                         // 이미 방문한 노드일 경우 skip
        else visited[node] = 1;                                 // 방문처리
        System.out.println(node);
        for (int i = 0; i < graph.get(node).length; i++) {      // 현재노드에서 갈 수 있는 노드 배열만큼 반복
                                                                // 가장 앞에있는(index = 0)의 노드부터 방문하게됨.
            dfs(graph, graph.get(node)[i]);
                                                                /*
                                                                    dfs(graph, node 번호) -> 1부터 시작
                                                                    현재 노드 번호 : 1
                                                                    현재 노드에서 갈 수 있는 노드 : {2, 3, 8}
                                                                    2, 3, 8 각 노드에 대해 다시 dfs 수행
                                                                    다시 dfs(graph, 2) 를 호출함으로써 가장 앞에 있는(index = 0) 노드부터 방문.

                                                                    2에서 방문할 수 있는 노드 : {1, 7} -> 위 과정 반복
                                                                 */
        }
    }
}   