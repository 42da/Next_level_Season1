import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.awt.Point;
import java.lang.Math;

public class _14562_태권왕 {
    public static Queue<Point> point = new LinkedList<>();      // 점수 담을 queue
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            Point score = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));    // 점수 입력(A, B)
            int x = score.x, y = score.y;
            int cnt = 0;
            boolean stop = false;
            point.add(new Point(x, y));
            Point temp_p;
            do {                            // 점수 같아질 때 까지 반복
                cnt++;
                temp_p = point.poll();      // queue 에 담겨져 있는 점수 (A, B)를 꺼내옴.(가장 앞에서 빼옴)
                
                if (2 * temp_p.x == temp_p.y + 3) {     // 연속발차기 1 수행시 점수 같아질 경우
                    stop = true;                        // 멈춤
                    sb.append((int) Math.floor(Math.log(cnt) / Math.log(2)) + 1).append('\n');
                    point.clear();                      // 점수 담아준 queue 초기화
                } else {
                    point.add(new Point(2 * temp_p.x, temp_p.y + 3));   // 점수 같지 않을 경우 그 점수를 다시 queue에 넣어줌.
                }
                if (temp_p.x + 1 == temp_p.y) {                         // 연속발차기 2 수행시 점수 같아질 경우
                    stop = true;
                    sb.append((int) Math.floor(Math.log(cnt) / Math.log(2)) + 1).append('\n');
                    point.clear();
                } else {
                    point.add(new Point(temp_p.x + 1, temp_p.y));       // 마찬가지로 점수 같지 않을 경우 그 점수를 queue에 넣어줌.
                    
                }
                // if (kick1(temp_p.x, temp_p.y)) {
                //     stop = true;
                //     sb.append((int) Math.floor(Math.log(cnt) / Math.log(2)) + 1).append('\n');
                //     point.clear();
                // }
                // else if (kick2(temp_p.x, temp_p.y)) {
                //     stop = true;
                //     sb.append((int) Math.floor(Math.log(cnt) / Math.log(2)) + 1).append('\n');
                //     point.clear();
                // }
            } while (!stop);            // 점수 같아질 때까지(stop = true 될 때 까지) 반복
        }
        System.out.println(sb);
    }
    // public static boolean kick1(int x, int y) {
    //     if (2 * x == y + 3) {
    //         return true;
    //     } else {
    //         point.add(new Point(2 * x, y + 3));
    //         return false;
    //     }
    // }
    // public static boolean kick2(int x, int y) {
    //     if (x + 1 == y) {
    //         return true;
    //     } else {
    //         point.add(new Point(x + 1, y));
    //         return false;
    //     }
    // }
}
