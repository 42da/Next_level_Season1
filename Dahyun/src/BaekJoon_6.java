import java.util.Scanner;

// 2455_220831 ?? 문제 이해가 안감
public class BaekJoon_6 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String result = "";

        while (put.hasNext()){
            int testValue = put.nextInt();
            while (testValue > 1){
                if(IsEven(testValue)){
                    testValue = testValue / 2;
                }else{
                    testValue = (testValue * 3) + 1;
                }
            }

            result += Integer.toString(testValue) + "\n";
        }

        System.out.println(result);
    }
    public static Boolean IsEven (int value) {
        if (value % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
