import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 1026_220831
public class BaekJoon_3 {
    public static void main(String[] args) {
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
