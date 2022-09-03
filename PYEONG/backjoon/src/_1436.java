import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class _1436 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        

        String str = br.readLine();
        // str = str.chars()        // IntStream
        //         .sorted()
        //         .collect(StringBuilder::new,
        //                 StringBuilder::appendCodePoint,
        //                 StringBuilder::append)
        //         .toString();

        String[] strArr = new String[26];
        Integer[] strCntArr = new Integer[26];
        int strLen = str.length();
        for (int i = 0; i < strLen - 1; i++) {
            char s = str.charAt(i);
            char _s = str.charAt(i + 1);
            // if (s == _s) 
        }
        System.out.println(str);
    }
}
