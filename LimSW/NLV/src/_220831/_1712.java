package _220831;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1712 { // 손익분기점
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" "); // 0:A 1:B 3:C
        int fixed = Integer.parseInt(line1[0]); // 고정지출 A
        int salary = Integer.parseInt(line1[1]); // 인건비 B
        int sell = Integer.parseInt(line1[2]); // 판매가격 C

        if(salary < sell){ // 수지타산 맞음
            System.out.println((fixed/(sell-salary))+1); // 방정식 계산하니까 이 식 나옴
        }
        else{ // 수지타산 안맞음 (인건비가 제품보다 비싸면 망함)
            System.out.println(-1);
        }
    }
}