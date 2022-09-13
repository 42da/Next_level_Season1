import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthStyle;

import java.lang.Math;

public class _11729_하노이_ {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        System.out.println((int)Math.pow(2, n) - 1);        // 이동 횟수: 2^n - 1
        move(n, 1, 3, 2, sb);
        System.out.println(sb);
    }
    public static void move(int n,int start, int end, int mid, StringBuilder sb) {
        if (n == 1) {
            sb.append(start).append(" ").append(end).append('\n');
            // System.out.println(start + " " + end);       // 시간 초과
            return;
        }
        move(n-1, start, mid, end, sb);
        sb.append(start).append(" ").append(end).append('\n');
        // System.out.println(start + " " + end);
        move(n-1, mid, end, start, sb);
    }
}
