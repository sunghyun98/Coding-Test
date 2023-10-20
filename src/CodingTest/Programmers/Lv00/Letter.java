package CodingTest.Programmers.Lv00;

import java.util.Scanner;

public class Letter {
    public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("편지 내용 ");
        String message = sc.next();
        System.out.println(solution(message));


    }
}
