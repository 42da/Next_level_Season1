package _220907.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1735 { // 분수 합
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp1; // 첫째줄
        String[] temp2; // 둘째줄
        int bunza = 0; // 분자
        int bunmo = 0; // 분모
        int small = 0; // 최대공약수용
        int key = 0; // 최대공약수
        
        temp1 = bf.readLine().split(" ");
        temp2 = bf.readLine().split(" ");
        bunmo = Integer.parseInt(temp1[1])*Integer.parseInt(temp2[1]); // 분모는 분모끼리 곱하면됨
        bunza = Integer.parseInt(temp1[0])*Integer.parseInt(temp2[1]) + Integer.parseInt(temp2[0])*Integer.parseInt(temp1[1]);
        
        small = (bunza < bunmo) ? bunza : bunmo; // 둘중 작은거

        for (int i = 1; i <= small; i++) { // 최대공약수 구해서
            if (bunza % i == 0 && bunmo % i == 0)
                key = i;
        }
        if(key!=0){ // 있으면
            bunza = bunza/key; // 나누고
            bunmo = bunmo/key; // 나누고
        }

        System.out.println(bunza+" "+bunmo); // 기약분수로 출력
    }
}