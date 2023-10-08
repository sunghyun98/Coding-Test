package CodingTest.Programmers.Lv00;

import java.util.Scanner;

class DeleteString {
    public String solution(String my_string) {
        String answer = "";
        char[] answerR = my_string.toCharArray();

        for (int i = answerR.length - 1; i >= 0; i--) {
            boolean isDuplicate = false;
            for (int j = i - 1; j >= 0; j--) {
                if (answerR[i] == answerR[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                answer += answerR[i];
            }
        }

        // 문자열을 뒤집어서 반환
        return new StringBuilder(answer).reverse().toString();
    }

    public static void main(String[] args) {

    }
}