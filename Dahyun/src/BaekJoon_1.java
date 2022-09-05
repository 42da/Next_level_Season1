import java.util.Arrays;
import java.util.Scanner;

// 2693_220831
public class BaekJoon_1 {
    public static void main(String[] args) {
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
