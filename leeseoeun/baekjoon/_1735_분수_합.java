package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1735_분수_합 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] fractionA = new int[2];
    int[] fractionB = new int[2];

    String str = "";
    String[] strArr = new String[2];
    for (int i = 0; i < 2; i++) {
      str = br.readLine();

      strArr = str.split(" ");
      for (int j = 0; j < 2; j++) {
        if (i == 0) {
          fractionA[j] = Integer.parseInt(strArr[j]);

        } else {
          fractionB[j] = Integer.parseInt(strArr[j]);
        }
      }
    }

    int numerator = (fractionA[0] * fractionB[1]) + (fractionB[0] * fractionA[1]);
    int denominator = fractionA[1] * fractionB[1];
    int gcd = gcd(numerator, denominator);
    System.out.println((numerator / gcd) + " " + (denominator / gcd));

  }

  // 유클리드 호제법
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;

    } else {
      return gcd(b, a % b);
    }
  }

}
