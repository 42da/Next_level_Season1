import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2693 { // N번째 큰 수
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        int numOfArr = 0; // 최초에 배열수 입력받기
        String[] arrStr; // sort를 위한 임시 split배열

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        numOfArr = Integer.parseInt(bf.readLine());

        int[] arrInt = new int[10]; // arrStr을 변환해서 담을 int배열
        int[] answer = new int[numOfArr]; // 답안 배열

        for(int i=0;i<numOfArr;i++) { // 배열수 만큼 반복
            arrStr = bf.readLine().split(" ");
            for(int j=0;j<10;j++) {
                arrInt[j] = Integer.parseInt(arrStr[j]);
            }

            Arrays.sort(arrInt); // 10개 모이면 sort
            answer[i] = arrInt[7];
        }

        for(int i=0;i<numOfArr;i++) {
            System.out.println(answer[i]);
        }
    }
}