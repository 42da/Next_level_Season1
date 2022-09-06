package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908_상수 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 수 거꾸로
    StringBuffer sb = new StringBuffer(br.readLine());
    String str = sb.reverse().toString();

    // 수 비교
    StringTokenizer st = new StringTokenizer(str);
    int number = Integer.parseInt(st.nextToken());
    int number2 = Integer.parseInt(st.nextToken());
    if (number > number2) {
      System.out.println(number);

    } else if (number < number2){
      System.out.println(number2);
    }
  }

}
