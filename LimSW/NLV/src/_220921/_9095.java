package _220921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _9095 { // 1, 2, 3 더하기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        //int[] arr = new int[num];
        int temp = 0;
        int temp2 = 0;

        String result = "";
        ArrayList list = new ArrayList();
        list.add(0); // 숫자랑 인덱스 맞추기
        list.add(1); // 1 표현방법 수
        list.add(2); // 2 표현방법 수
        list.add(4); // 3 표현방법 수

        for(int i=0;i<num;i++){
            temp = Integer.parseInt(bf.readLine()); // 숫자 받아서
            if(list.size()-1 >= temp){ // 이전 숫자들 이미 계산 했으면
                if(temp==1 || temp==2 || temp==3){ // 1~3은 이미 계산되어있음
                    result += list.get(temp)+"\n"; // 이거 안하면 index 뻥남
                }
                else{
                    temp2 = Integer.parseInt(String.valueOf(list.get(temp-3)))+Integer.parseInt(String.valueOf(list.get(temp-2)))+Integer.parseInt(String.valueOf(list.get(temp-1)));
                    result += temp2+"\n"; // for문 안돌고 그대로 넣기
                    if(list.size() == temp-1){ // 만약 size랑 이번 숫자-1이랑 같으면
                        list.add(temp2); // 바로 다음숫자니까 이경우에만 add
                    }
                }
            }
            else{ // 계산 해야되면
                for(int j=list.size();j<temp+1;j++){ // 처음부터 말고 다음숫자부터 목표까지 돌려
                    temp2 = Integer.parseInt(String.valueOf(list.get(j-3)))+Integer.parseInt(String.valueOf(list.get(j-2)))+Integer.parseInt(String.valueOf(list.get(j-1)));
                    list.add(temp2); // 계산은 다 저장
                }
                result += temp2+"\n"; // 결과 담고
            }
        }
        System.out.println(result); // 결과출력
    }
}
