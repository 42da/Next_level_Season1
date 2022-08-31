package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _1026_보물 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 배열 개수
    int number = Integer.parseInt(br.readLine());

    // 배열
    int[] arrA = new int[number];
    Integer[] arrB = new Integer[number];

    for (int i = 0; i < 2; i++) {
      String str = br.readLine();
      StringTokenizer st = new StringTokenizer(str);

      for (int j = 0; j < number; j++) {
        if (i == 0) {
          arrA[j] = Integer.parseInt(st.nextToken());

        } else if (i == 1) {
          arrB[j] = Integer.parseInt(st.nextToken());
        }
      }
    }

    // 배열 정렬
    Arrays.sort(arrA);
    Arrays.sort(arrB, Comparator.reverseOrder());   // Comparator 사용 시 int -> Integer

    int min = 0;
    for (int i = 0; i < number; i++) {
      min += (arrA[i] * arrB[i]);
    }

    System.out.println(min);

  }

}
