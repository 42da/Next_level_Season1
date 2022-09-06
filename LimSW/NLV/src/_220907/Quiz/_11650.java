package _220907.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11650 { // 좌표 정렬하기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        int[][] arr = new int[num][2];
        String line = "";
        // 여기까지 쓸변수 선언
        
        for(int i=0;i<num;i++){ // 한줄씩 읽어서 2차원배열로 저장
            line = bf.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]); // pos x
            arr[i][1] = Integer.parseInt(line.split(" ")[1]); // pos y
        }
        
        Arrays.sort(arr, (a,b)->{ // https://st-lab.tistory.com/110 람다식 참고
            if(a[0] == b[0]){ // compare 조건으로 람다를 줘서 sort
                return a[1] - b[1];
            }
            else{
                return a[0] - b[0];
            }
        }); // 자바는 람다를 통해 2차원 배열 정렬 가능

        for(int i=0;i<num;i++){ // 정답 출력
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}
