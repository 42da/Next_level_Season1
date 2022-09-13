package _220914;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://velog.io/@sennys2/%EB%B0%B1%EC%A4%8014562.%ED%83%9C%EA%B6%8C%EC%99%95Java
public class _14562 { // 태권왕
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[] S = new int[num];
        int[] T = new int[num];
        String[] temp;
        int min;
        String result = "";

        for (int i = 0; i < num; i++) { // 숫자 일단 담고
            temp = bf.readLine().split(" ");
            S[i] = Integer.parseInt(temp[0]);
            T[i] = Integer.parseInt(temp[1]);
        }

        for (int i = 0; i < num; i++) {
            min = kick(S[i], T[i], 0); // 발차기 시작
            result+=min+"\n"; // 회차마다 발차기 횟수 담기
        }

        System.out.println(result); // 결과 출력
    }

    public static int kick(int S, int T, int count) {
        if (S > T) {
            return 100;
        }
        if (S == T) { // 점수같으면 0번차야됨
            return count;
        }
        else {
            int min1 = kick(S * 2, T + 3, count + 1); // 1번 발차기
            int min2 = kick(S + 1, T, count + 1); // 2번 발차기
            return Math.min(min1, min2);
        }
    }
}
