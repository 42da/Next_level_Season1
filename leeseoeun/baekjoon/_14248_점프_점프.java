package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14248_점프_점프 {

  // main, bfs에서 사용해야 되니까
  static boolean[] checkArr;

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 돌 개수
    int number = Integer.parseInt(br.readLine());
    checkArr = new boolean[number];

    // 돌 배열
    String str = br.readLine();
    String[] strArr = str.split(" ");

    int[] numberArr = new int[number];
    for (int i = 0; i < number; i++) {
      numberArr[i] = Integer.parseInt(strArr[i]);
    }

    // 출발 돌
    int start = Integer.parseInt(br.readLine());

    // BFS
    bfs(numberArr, start - 1);  // 인덱스는 0부터니까 -1

    System.out.println("----- 끝 -----");

    for (int i = 0; i < number; i++) {
      System.out.println(checkArr[i]);
    }
  }

  private static void bfs(int[] numberArr, int start) {
    // 돌 체크
    if (checkArr[start]) {
      return;

    } else {
      checkArr[start] = true;
    }
  }

}
