package _220831;

import java.util.Scanner;

// 2455_220831
public class BaekJoon_5 {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        String[] station1 = put.nextLine().split(" ");
        String[] station2 = put.nextLine().split(" ");
        String[] station3 = put.nextLine().split(" ");
        String[] station4 = put.nextLine().split(" ");

        int maxTotal = 0;
        int nowTotal = 0;
        for(int i = 0; i < 4; i++){
            if(i == 0){
                maxTotal = Integer.parseInt(station1[1]);
                nowTotal = maxTotal;
            }
            else if(i == 1){
                nowTotal = nowTotal - Integer.parseInt(station2[0]) + Integer.parseInt(station2[1]);
                maxTotal = maxTotal > nowTotal ? maxTotal : nowTotal;
            }
            else if(i == 2){
                nowTotal = nowTotal - Integer.parseInt(station3[0]) + Integer.parseInt(station3[1]);
                maxTotal = maxTotal > nowTotal ? maxTotal : nowTotal;
            }
            else if(i == 3){
                nowTotal = nowTotal - Integer.parseInt(station4[0]);
                maxTotal = maxTotal > nowTotal ? maxTotal : nowTotal;
            }
        }

        System.out.println(maxTotal);
    }
}
