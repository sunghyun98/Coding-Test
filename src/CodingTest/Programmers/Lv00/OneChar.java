package CodingTest.Programmers.Lv00;

import java.util.Arrays;

/*
한번만 등장한 문자열 찾기

 */
public class OneChar {
    public static void main(String[] args) {
        String s = "hello";
        String answer ="";
        int t = 1;
        char s1[] = s.toCharArray();
        Arrays.sort(s1);

        //a a a b c c d d
        for (int i = 0; i < s1.length; i++){
            int count = 0;
            for (int j = 0; j < s1.length; j++){
                if(s1[i] == s1[j]){
                    count++;
                }
            }
            if (count == 1){
                answer += s1[i];
            }
        }
        System.out.println(answer);
    }
}
