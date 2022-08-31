import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3943 { // 헤일스톤 수열
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine()); // case 몇개?
        int start = 0; // 시작숫자용 변수
        int biggest = 0; // 최대값 저장
        int[] answer = new int[num]; // 정답배열
        
        for(int i=0;i<num;i++){ // 첫 줄 수만큼 case
            start = Integer.parseInt(bf.readLine()); // 시작숫자
            biggest = start; // 시작숫자도 비교대상이다 첫 수를 최대값으로 해야함
            while(start != 1){ // 1 오면 컷
                if(start%2==0){ // 짝이면
                    start = start/2;
                }
                else{ // 홀이면
                    start = (start*3)+1;
                }
                if(start>biggest){ // 큰 값인지
                    biggest = start;
                }
            }
            answer[i] = biggest; // 루프중 최대값 저장
        }
        
        for(int i=0;i<answer.length;i++) {
            System.out.println(answer[i]); // 정답
        }
    }
}
