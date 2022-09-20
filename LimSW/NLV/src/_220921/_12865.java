package _220921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12865 { // 평범한 배낭
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");

        int num = Integer.parseInt(line[0]); // 물건 개수
        int limit = Integer.parseInt(line[1]); // 최대용량
        int[][] stuff = new int[num+1][2];

        for(int i=1;i<=num;i++) {
            line = bf.readLine().split(" ");
            stuff[i][0] = Integer.parseInt(line[0]); // 용량
            stuff[i][1] = Integer.parseInt(line[1]); // 가치
        }

        /* 틀린 알고리즘
        for(int i=0;i<stuff.length;i++){ // 용량초과 안하는 모든 경우 해봄
            int tempLimit = 0; // 임시 리밋
            int tempResult = 0; // 임시 결과
            for(int j=i;j< stuff.length;j++){ // i번째 물건부터 뒤에꺼 하면 됨
                tempLimit+=stuff[j][0]; // 일단 채워
                if(tempLimit > limit){ // 용량 초과면?
                    break; // 뒤에도 불보듯 뻔하다
                }
                else{ // 용량 안넘네?
                    tempResult+=stuff[j][1]; // 일단 임시 결과에 담아
                }

                if(tempResult > result){ // 최대값인지 확인해서
                    result = tempResult; // 결과에 담고
                }

                if(tempLimit == limit){ // 꽉찼으면 다음거 할 필요 없음
                    break;
                }
            }
        }
        */
        //https://velog.io/@yanghl98/%EB%B0%B1%EC%A4%80-12865-%ED%8F%89%EB%B2%94%ED%95%9C-%EB%B0%B0%EB%82%AD-JAVA%EC%9E%90%EB%B0%94
        int[][] dp = new int[num + 1][limit + 1];

        for (int k = 1; k <= limit; k++) { // 무게
            for (int i = 1; i <= num; i++) { // stuff
                dp[i][k] = dp[i - 1][k];
                if (k - stuff[i][0] >= 0) {
                    dp[i][k] = Math.max(dp[i - 1][k], stuff[i][1] + dp[i - 1][k - stuff[i][0]]);
                }
            }
        }
        
        System.out.println(dp[num][limit]); // 결과 출력
    }
}
