package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1300_K번째_수 {

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int k = Integer.parseInt(br.readLine());

    int number = 0;
    int[] b = new int[n * n];

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        b[number] = i * j;

        number++;
      }
    }

    Arrays.sort(b);

    System.out.println(b[k]);

  }

}
