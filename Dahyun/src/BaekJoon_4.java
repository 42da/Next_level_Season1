import java.util.Scanner;

// 2098_220831
public class BaekJoon_4 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String A = Integer.toString(put.nextInt());
        String B = Integer.toString(put.nextInt());
        StringBuffer sb_a = new StringBuffer(A);
        int reversedStrA = Integer.parseInt(sb_a.reverse().toString());
        StringBuffer sb_b = new StringBuffer(B);
        int reversedStrB = Integer.parseInt(sb_b.reverse().toString());

       int result = reversedStrA < reversedStrB ? reversedStrB : reversedStrA;

       System.out.println(result);

    }
}
