package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14248_점프_점프 {

  // main, bfs에서 사용해야 되니까
  static int[] arr;
  static boolean[] checkArr;

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 돌 개수
    int number = Integer.parseInt(br.readLine());
    arr = new int[number];
    checkArr = new boolean[number];

    // 돌 배열
    String str = br.readLine();
    String[] strArr = str.split(" ");

    for (int i = 0; i < number; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }

    // 출발 돌
    int start = Integer.parseInt(br.readLine());

    // BFS
    bfs(start - 1);  // 인덱스는 0부터니까 -1

    int check = 0;
    for (int i = 0; i < number; i++) {
      if (checkArr[i]) {
        check++;
      }
    }

    System.out.println(check);
  }

  private static void bfs(int start) {
    // 돌 체크
    if (checkArr[start]) {
      return;

    } else {
      checkArr[start] = true;
    }

    // 왼쪽으로 이동
    int left = start - arr[start];
    if (left >= 0) {
      bfs(left);
    }

    // 오른쪽으로 이동
    int right = start + arr[start];
    if (right < arr.length) {
      bfs(right);
    }
  }

}
