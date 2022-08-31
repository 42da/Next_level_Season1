import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 { // 영화감독 숌
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());

        int sss = 666; // 첫작
        int count = 0; // N번째 666

        while(count!=num){ // N번째 될때까지
            if(String.valueOf(sss).contains("666")){ // 666 포함되면 N에+1해줌
                count++;
            }
            if(count!=num){ // 1씩 올리기
                sss++;
            }
        }
        System.out.println(sss); // 정답
    }
}
