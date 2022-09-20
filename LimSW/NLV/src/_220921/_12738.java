package _220921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _12738 { // 가장 긴 증가하는 부분 수열 3
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[] line = bf.readLine().split(" "); // 숫자 개수
        int temp = 0; // 임시숫자
        ArrayList<Integer> list = new ArrayList<>(); // 수열 담을 리스트
        list.add(0); // 리스트 맨앞에 0 추가

        for(int i=0;i<num;i++){ // 숫자 모두 체크
            temp = Integer.parseInt(line[i]); // 이번 숫자

            if(list.get(list.size()-1) < temp){ // 이번숫자 위치가 맨 뒷자리가 맞으면
                list.add(temp); // 맨뒤에 놓기
            }
            else{ // 아니면 찾아야되니까 이진탐색 시작
                int first = 1; // 0 제외하고 리스트 처음 index
                int last = list.size()-1; // 리스트 마지막 index

                while(last > first){ // 탐색
                    int half = (first + last) / 2;
                    if(list.get(half)<temp){
                        first = half+1; // 왼쪽 한칸 당기기
                    }
                    else{
                        last = half; // 오른쪽을 중앙으로 당기기
                    }
                }
                list.set(last, temp); // 빠져나오면 그 위치가 이번숫자 위치
            }
        }

        System.out.println(list.size()-1); // 맨 앞에 추가한 0 빼고 정답
    }
}
