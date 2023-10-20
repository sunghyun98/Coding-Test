package CodingTest.Programmers.Lv00;

import java.util.Arrays;
import java.util.Scanner;

public class ReArr {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i = num_list.length-1; i >= 0; i--){
            answer[j] = num_list[i];
            j++;
        }
        return answer;
    }

    public static void main(String[] args) {
        ReArr reArr = new ReArr(); // 변수 이름을 Java 규칙에 따라 수정
        Scanner sc = new Scanner(System.in);

        System.out.print("요소의 개수를 입력하세요: ");
        int N = sc.nextInt();

        int[] num_list = new int[N]; // 입력한 개수에 맞게 배열 초기화

        System.out.println("요소를 입력하세요:");

        for (int i = 0; i < N; i++) {
            num_list[i] = sc.nextInt();
        }

        int[] reversedArray = reArr.solution(num_list);

        System.out.println("뒤집힌 배열:");
        System.out.println(Arrays.toString(reversedArray));
    }
}