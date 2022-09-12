package _220907.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class _14248 { // 점프 점프
    static int result = 0;
    static HashMap<Integer, Boolean> map = new HashMap<>();
    static int[] arr; // static 해도 되는이유는 배열이 정적이어서
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine()); // 돌 몇개?
        arr = new int[num];
        String[] sArr = bf.readLine().split(" ");
        int first = Integer.parseInt(bf.readLine());
        
        for(int i=0;i<num;i++){
            map.put(i,false); // 돌 판별기 맵
            arr[i] = Integer.parseInt(sArr[i]); // 여기에 돌판 만들고
        }

        check(arr[first-1], first-1); // x번째는 idx + 1 이니까 1 빼줌
        
        System.out.println(result); // 결과 출력
    }

    public static void check(int rock, int idx){ // 체크는 현재 도착한 돌이 밟힌돌인지 확인
        boolean flag = false; // 이미 밟힌돌이면 다른돌로 건너갈 필요가 없음
        int left = 0; // 왼쪽으로 뛸수있는 최대 idx
        int right = 0; // 오른쪽으로 뛸수있는 최대 idx

        if(!map.get(idx)){ // 처음이신가요?
            map.put(idx, true); // 처음이면 돌판별기 true로 바꿈
            result++; // 처음 밟은 돌은 밟을수 있는돌이니까 1올리고
            flag = true; // 처음 밟은 돌이니까 왼쪽 오른쪽으로 뛰게 해줌
        }

        if(flag) { // 처음 밟은 돌이면 뛰는걸 허가한다.
            if (idx - rock >= 0) { // IndexOutOfBoundsException이 난 싫다 왼쪽 점프준비
                left = idx - rock; // 안넘어가면 점프가능
                check(arr[left], left); // 뛰어
            }

            if (idx + rock < arr.length) { // 오른쪽도 똑같이
                right = idx + rock; // 안넘어가면 점프가능
                check(arr[right], right); // 뛰어
            }
        }
    }
}
