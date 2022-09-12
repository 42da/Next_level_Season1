package _220831;

import java.util.Scanner;

// 1436_220831  https://st-lab.tistory.com/103 이해안됨
public class BaekJoon_7 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int testValue = put.nextInt();
        int num = 666;
        int count = 1;

        while(count != testValue) {
            num++;
            if(String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }
}
