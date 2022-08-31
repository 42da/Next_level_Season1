import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class _1213 { // 팰린드롬 만들기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine(); // 인풋 읽어오기
        int lLength = line.length(); // 길이필요 홀짝판별
        ArrayList arr = new ArrayList(); // 문자열 전제 sort해서 쓸거임
        Object temp; // 비교할 리스트 맨 앞문자 저장용
        String answer = ""; // 답 저장용
        String center = ""; // 홀수면 가운데 글자용
        boolean ansFlag = true; // 정답 나올수있는지 flag
        boolean chanceFlag = true; // 홀수면 짝안맞는 문자 두개이상이면 컷 flag

        for(int i=0;i<lLength;i++){ // arraylist 채우고
            arr.add(line.substring(i,i+1));
        }

        arr.sort(Comparator.naturalOrder()); // 알파벳순으로 sort 사전순답안이라서

        if(lLength%2==0){ // 글자수가 짝이면
            while(arr.size()>0){ // arr 다 닳을때까지 굴려
                temp = arr.remove(0); // 맨앞에 때와서 비교
                if(arr.contains(temp)){ // 짝있으면
                    answer+=temp; // 답안에 추가
                    arr.remove(0); // 짝 지우기
                }
                else{ // 짝없으면
                    ansFlag=false; // 정답 안나옴
                    break; // 반복문빠이
                }
            }
            if(ansFlag) { // 정답 나오는지 체크해서
                StringBuffer sb = new StringBuffer(answer);
                answer += sb.reverse().toString(); // 짝수니까 그대로 뒤집어서 뒤에붙히면 정답
            }
            else {
                answer = "I'm Sorry Hansoo"; // 노답
            }
        }
        else{ // 글자수가 홀이면
            while(arr.size()>0){ // arr 다 닳을때까지 굴려
                temp = arr.remove(0); // 맨앞에 때와서 비교
                if(arr.contains(temp)){ // 짝있으면
                    answer+=temp; // 짝수랑 똑같이 동작
                    arr.remove(0); // 짝 지우기
                }
                else if(!arr.contains(temp)&&chanceFlag){ // 짝없으면 한번은 봐줌(chanceFlag)
                    chanceFlag = false; // 한번만 봐줌
                    center+=temp; // 홀수인데 최초로 짝없으면 정답의 가운데글자
                }
                else{ // 두번 봐주세요 하면
                    ansFlag = false; // 정답 안나옴
                    break; // 반복문탈출
                }
            }
            if(ansFlag) { // 정답 나오는지 flag 판별
                StringBuffer sb = new StringBuffer(answer);
                String rev = sb.reverse().toString(); // 일단 정답 반쪽 뒤집어서 저장하고
                answer += center; // 정답 반쪽 정방향 + 가운데 글자
                answer += rev; // 뒤집은거 더하면 정답
            }
            else {
                answer = "I'm Sorry Hansoo"; // 노답
            }
        }
        
        System.out.println(answer); // 정답
    }
}
