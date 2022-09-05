package _220831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2455 { // 지능형 기차
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = new String[2]; // 타고 내리는거
        int sum = 0; // 역마다 타있는사람 수
        int most = 0; // 최대값
        for(int i=0;i<4;i++){ // 역 4개 제한
            line = bf.readLine().split(" "); // 탄거 내린거 쪼개서
            sum+=Integer.parseInt(line[1]); // 탄사람 더하고
            sum-=Integer.parseInt(line[0]); // 내린사람 빼고
            if(sum>most){ // 최대값이랑 비교
                most = sum; // 최대면 킵
            }
        }
        System.out.println(most); // 정답
    }
}
