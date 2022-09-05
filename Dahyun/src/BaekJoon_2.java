import java.util.Scanner;

// 1712_220831
public class BaekJoon_2 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        int A = put.nextInt();
        int B = put.nextInt();
        int C = put.nextInt();

        int BEP = 0;
        if((B-C) < 0){
            BEP = (A / (C-B))  + 1;
        }else{
            BEP = -1;
        }

        System.out.println(BEP);
    }
}
