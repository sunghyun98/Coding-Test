package CodingTest.Programmers.Lv00;

import java.util.Arrays;

public class ArrCut {
    public static int solution(int[] array) {
        // 주어진 배열을 오름차순으로 정렬합니다.
        Arrays.sort(array);

        int answer = 0; // 최종 결과를 저장할 변수
        int max = 0; // 현재까지 발견된 최빈값의 빈도
        int maxNum = array[0]; // 현재까지 발견된 최빈값
        int cnt = 1; // 현재 값의 빈도

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                cnt++; // 현재 값과 이전 값이 같으면 빈도를 증가
                if (cnt > max) {
                    max = cnt; // 현재 값의 빈도가 현재까지 최빈값의 빈도보다 크면 업데이트
                    maxNum = array[i]; // 최빈값 업데이트
                } else if (cnt == max) {
                    maxNum = -1; // 최빈값이 여러 개일 경우 -1로 표시
                }
            } else {
                cnt = 1; // 현재 값과 이전 값이 다르면 빈도를 1로 초기화
            }
        }

        answer = maxNum; // 최종 결과를 설정

        return answer;
    }
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2};

        // solution 함수를 호출하여 최빈값을 찾고 결과를 출력
        System.out.println(solution(array));

    }
}