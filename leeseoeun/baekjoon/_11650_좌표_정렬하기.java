package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _11650_좌표_정렬하기 {

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(br.readLine());
    int[][] xyArr = new int[number][2];

    String str = "";
    String[] strArr = new String[2];
    for (int i = 0; i < number; i++) {
      str = br.readLine();

      strArr = str.split(" ");
      for (int j = 0; j < strArr.length; j++) {
        xyArr[i][j] = Integer.parseInt(strArr[j]);
      }
    }

    Arrays.sort(xyArr, new Comparator<int[]>() {

      @Override
      public int compare(int[] o1, int[] o2) {
        // x 좌표가 같다면
        if (o1[0] == o2[0]) {
          // y 좌표를 기준으로 정렬
          return o1[1] - o2[1];

        } else {
          return o1[0] - o2[0];
        }
      }

    });

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < 2; j++) {
        System.out.print(xyArr[i][j]);

        if (j == 0) {
          System.out.print(" ");
        }
      }

      System.out.println();
    }

  }

}
