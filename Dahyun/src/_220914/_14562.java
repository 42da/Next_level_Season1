package _220914;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class _14562 {
    private static class Game {
        int s, t, count;
        Game(int s, int t, int count) {
            this.s = s;
            this.t = t;
            this.count = count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalCnt = sc.nextInt();
        int[] S = new int[totalCnt];
        int[] T = new int[totalCnt];
        // 각 점수 넣기
        for (int i = 0; i < totalCnt; i++) {
            S[i] = sc.nextInt();
            T[i] = sc.nextInt();

            int minValue = getMinCount(S[i], T[i], 0);
            System.out.println(minValue);
        }
    }

    public static int getMinCount(int s, int t, int count) {
        Queue<Game> que = new LinkedList<>();
        que.add(new Game(s, t, 0)); // 초기값
        int result = count;
        while (!que.isEmpty()) {
            Game game = que.poll();

            if (game.s == game.t) {
                result = game.count;
                break;
            }
            if (game.s * 2 <= game.t + 3) {
                que.add(new Game(game.s * 2, game.t + 3, game.count + 1));
            }

            que.add(new Game(game.s + 1, game.t, game.count + 1));
        }
        return  result;
    }
}

