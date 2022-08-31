import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class _1026 { // 보물
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = 0; // 첫 줄 숫자
        num = Integer.parseInt(bf.readLine());
        
        String[] arrS1 = bf.readLine().split(" "); // 둘쨰줄 배열
        String[] arrS2 = bf.readLine().split(" "); // 셋쨰줄 배열
        Integer[] arrI1 = new Integer[num]; // 둘쨰줄 배열
        Integer[] arrI2 = new Integer[num]; // 셋쨰줄 배열

        for(int i=0;i<num;i++){ // string 배열 숫자 배열로
            arrI1[i] = Integer.parseInt(arrS1[i]);
            arrI2[i] = Integer.parseInt(arrS2[i]);
        }

        Integer[] answer = new Integer[num]; // 정답 놓을 배열
        Integer[] tempArr = arrI2; // arrI2 정렬해놓을 임시배열

        Arrays.sort(arrI1); // 첫째줄 배열 낮은 숫자부터 쭈루룩
        Arrays.sort(tempArr, Collections.reverseOrder()); // 둘째줄 배열 높은 숫자부터 쭈루룩

        for(int i=0;i<num;i++){ // 곱해서 더했을때 작은수려면 제일큰거 X 제일 작은거 하면 됨
            for(int j=i;j<num;j++){ // 2중 for문 써서 남은 수중 제일 큰수에 맞는 제일 작은수 구함
                if(tempArr[i]==arrI2[j]){ // arr1의 제일 작은수를 arr2의 제일 큰수 위치 찾아서
                    answer[j]=arrI1[i]; // 맞은편에 놓기
                    break;
                }
            }
        }

        int sum = 0; // 곱해서 더해야함
        for(int i=0;i<num;i++){
            sum+=(answer[i]*arrI2[i]); // 말그대로 짝맞춰서 곱하고 더함
        }
        System.out.println(sum); // 정답출력
    }
}
