package CodingTest.Programmers.Lv00;

import java.util.Arrays;

public class LetterR {
    public int[] solution(String my_string) {
        int[] answer = new int[100];
        for(int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 0 && my_string.charAt(i) < 10) {
                answer[i] = Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int a = 'A'; //65
        int b = 'a'; //97
        System.out.println(b-a);
    }
}
