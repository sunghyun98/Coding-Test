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
        DeleteString deleteString = new DeleteString();

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요: ");
        String input = sc.nextLine();

        String result = deleteString.solution(input);
        System.out.println("중복 문자를 제거하고 뒤집은 결과: " + result);
    }
}