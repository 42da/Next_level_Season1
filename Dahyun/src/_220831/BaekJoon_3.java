package _220831;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 1026_220831
public class BaekJoon_3 {
    public static void main(String[] args) {
        /*옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다.
        이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
        길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
        S = A[0] × B[0] + ... + A[N-1] × B[N-1]
        S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자.
        단, B에 있는 수는 재배열하면 안 된다.
        S의 최솟값을 출력하는 프로그램을 작성하시오.*/

        Scanner put = new Scanner(System.in);
        int ArraySize = Integer.parseInt(put.nextLine());
        int [] tempA = new int[ArraySize];
        Integer [] tempB = new Integer[ArraySize];

        for(int i = 0; i < 2; i++){
            String[] tempValue = put.nextLine().split(" ");
            if(i == 0){
                for(int j = 0; j <ArraySize; j++){
                    tempA[j] = Integer.parseInt(tempValue[j]);
                }
            }else{
                if(i == 1){
                    for(int j = 0; j <ArraySize; j++){
                        tempB[j] = Integer.parseInt(tempValue[j]);
                    }
                }
            }
        }

        // A랑 B 배열을 반대로 정렬
        Arrays.sort(tempA);
        Arrays.sort(tempB, Collections.reverseOrder());

        int resultValue = 0;
        for(int k = 0; k < ArraySize; k++){
            resultValue = resultValue + (tempA[k] * tempB[k]);
        }
        System.out.println(resultValue);
    }
}
