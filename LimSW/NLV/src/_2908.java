import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2908 { // 상수
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        for(int i=0;i<2;i++){ // 숫자 뒤집기
            String first = String.valueOf(line[i].charAt(0));
            String mid = String.valueOf(line[i].charAt(1));
            String last = String.valueOf(line[i].charAt(2));
            line[i] = last + mid + first; // 거꾸로 만들기
        }

        int compA = Integer.parseInt(line[0]); // 숫자로
        int compB = Integer.parseInt(line[1]); // 바꿔서 비교

        if(compA>compB){ // 같은수 없는 조건이니까 흑백으로
            System.out.println(compA);
        }
        else{
            System.out.println(compB);
        }
    }
}
