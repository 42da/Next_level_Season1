package _220831;

import java.util.Arrays;
import java.util.Scanner;

// 2693_220831
public class BaekJoon_1 {
    public static void main(String[] args) {
        /*배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
        배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
        첫째 줄에 테스트 케이스의 개`수 T(1 ≤ T ≤ 1,000)가 주어진다.
        각 테스트 케이스는 한 줄로 이루어져 있고,
        배열 A의 원소 10개가 공백으로 구분되어 주어진다.
        이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다. */
        /*4
        1 2 3 4 5 6 7 8 9 1000
        338 304 619 95 343 496 489 116 98 127
        931 240 986 894 826 640 965 833 136 138
        940 955 364 188 133 254 501 122 768 408*/
        //String testValue = "940 955 364 188 133 254 501 122 768 408";
        int[] testValue = new int[10];
        Scanner put = new Scanner(System.in);
        for(int i =0; i < testValue.length; i ++){
            testValue[i] = put.nextInt();
        }
        // 배열 받아서 넣는데 왜 이건 틀린건지???
        Arrays.sort(testValue);
        System.out.println(Arrays.toString(testValue));
        System.out.println(testValue[7]);
    }
}
