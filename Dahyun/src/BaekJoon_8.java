import java.util.Scanner;

// 1213_220831  https://broship.tistory.com/134?category=845145 이해안됨
public class BaekJoon_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();

        int[] alp = new int[26];
        for(int i=0;i<size;i++)
            alp[input.charAt(i)-'A']++;  // 왜 'A' 뺌?

        int cnt = 0;
        int center = 0;
        for(int i=0;i<26;i++)
            if(alp[i]%2!=0) {
                center = i;
                cnt++;
            }

        if(cnt>1 || (cnt==1 && size%2==0)) {
            System.out.print("I'm Sorry Hansoo");
            return;
        }

        StringBuffer result = new StringBuffer();
        for(int i=0;i<26;i++)
            for(int j=0;j<alp[i]/2;j++)
                result.append((char)(i+'A'));       // 왜 A를 더함?
        StringBuffer tmp = new StringBuffer(result.toString());
        if(cnt==1) result.append((char)(center+'A'));   // 왜 A를 더함?
        System.out.println(result.toString()+tmp.reverse());
    }
}
