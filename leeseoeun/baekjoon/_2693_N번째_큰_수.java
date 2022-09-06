package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2693_N번째_큰_수 {

  public static void main(String[] args) throws IOException {

    // 배열 입력
    //    Scanner sc = new Scanner(System.in);
    //    String str = sc.nextLine();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    // 줄 개수
    int number = Integer.parseInt(br.readLine());
    for (int i = 0; i < number; i++) {

      // String -> int
      int[] numArr = new int[10];

      String str = br.readLine();
      String[] strArr = str.split(" "); // StringTokenizer
      for (int j = 0; j < 10; j++) {
        numArr[j] = Integer.parseInt(strArr[j]);
      }

      // 정답 출력
      Arrays.sort(numArr);
      // System.out.println(numArr[7]);
      // bw.write(numArr[7]);
      sb.append(numArr[7] + "\n");
    }

    System.out.println(sb);

  }

}
