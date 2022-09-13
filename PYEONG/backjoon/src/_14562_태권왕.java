import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;

public class _14562_태권왕 {
    public static Queue<HashMap<String,Integer>> point = new LinkedList<>();      // 점수 및 depth 담을 queue(HashMap으로 처리)
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());             // 점수 입력(A, B)

            point.add(new HashMap<>(){{
                put("x", x);
                put("y", y);
                put("count", 0);                                     // count -> depth
            }});
            while (true) {                                                      // 점수 같아질 때까지 반복
                
                HashMap<String,Integer> temp_p = point.poll();                  // queue 에 담겨져 있는 점수 (A, B, count)를 꺼내옴.(가장 앞에서 빼옴)
                
                if (2 * temp_p.get("x") == temp_p.get("y") + 3) {      // 연속발차기 1 수행시 점수 같아질 경우
                    sb.append(temp_p.get("count") + 1).append('\n');
                    point.clear();                                              // 점수 담아준 queue 초기화
                    break;                                                      // 멈춤
                } else if (2 * temp_p.get("x") > temp_p.get("y") + 3) {
                    // do nothing
                } else {                                                        // 점수 같지 않을 경우 그 점수를 다시 queue에 넣어줌.
                    point.add(new HashMap<>(){{
                       put("x", 2 * temp_p.get("x"));
                       put("y", temp_p.get("y") + 3);
                       put("count", temp_p.get("count") + 1);
                    }});   

                }
                if (temp_p.get("x") + 1 == temp_p.get("y")) {              // 연속발차기 2 수행시 점수 같아질 경우
                    sb.append(temp_p.get("count") + 1).append('\n');        
                    point.clear();
                    break;
                } else if (temp_p.get("x") + 1 > temp_p.get("y")) {
                    // do nothing
                } else {                                                            // 마찬가지로 점수 같지 않을 경우 그 점수를 queue에 넣어줌.
                    point.add(new HashMap<>(){{
                        put("x", temp_p.get("x") + 1);
                        put("y", temp_p.get("y"));
                        put("count", temp_p.get("count") + 1);
                    }});       
                }
            }          
        }
        System.out.println(sb);
    }
}