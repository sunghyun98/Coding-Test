package CodingTest.Beakjoon.Arrangement;

import java.util.Scanner;

/*
알파벳 대소문자로 된 단어가 주어지면,
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.
*/
public class B_1157 {
    public static void main(String[] args) {
        // 알파벳 빈도수를 저장할 배열 생성
        int arr[] = new int[26];
        Scanner sc = new Scanner(System.in);

        // 입력 문자열 받기
        String a = sc.nextLine();

        // 문자열을 순회하면서 알파벳 빈도수 계산
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                // 대문자일 경우 배열 인덱스 계산
                arr[a.charAt(i) - 65]++;
            } else {
                // 소문자일 경우 배열 인덱스 계산
                arr[a.charAt(i) - 97]++;
            }
        }

        // 가장 빈도수가 높은 알파벳 찾기
        int max = 0;
        char ch = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65); // 대문자로 변환
            } else if (arr[i] == max) {
                ch = '?'; // 최댓값이 여러 개일 경우 '?'로 표시
            }
        }

        // 결과 출력
        System.out.println(ch);
    }
}