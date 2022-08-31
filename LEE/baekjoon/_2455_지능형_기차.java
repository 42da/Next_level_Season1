package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2455_지능형_기차 {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // 승객
    int passenger = 0;

    for (int i = 0; i < 4; i++) {

      String str = br.readLine();
      String[] strArr = str.split(" "); // StringTokenizer

      // 승객 = (승객 - 내리는 사람 + 타는 사람)
      int newPassenger = (passenger - Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
      passenger = Math.max(passenger, newPassenger);    // Math.max() : 최댓값 구하기

    }

    System.out.println(passenger);

  }

}

/* 첫번째
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 승객
int passenger = 0;
int[] passengerArr = new int[4];

for (int i = 0; i < 4; i++) {

  String str = br.readLine();
  String[] strArr = str.split(" "); // StringTokenizer

  // 승객 = (승객 - 내리는 사람 + 타는 사람)
  int newPassenger = (passenger - Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]));
  passengerArr[i] = passenger;

}

Arrays.sort(passengerArr);
System.out.println(passengerArr[3]); */
