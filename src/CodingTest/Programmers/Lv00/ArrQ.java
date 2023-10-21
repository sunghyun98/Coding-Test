package CodingTest.Programmers.Lv00;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrQ {
    public static int solution(ArrayList<String> s1, ArrayList<String> s2) {
        int answer = 0;
        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < s2.size(); j++) {
                if (s1.get(i).equals(s2.get(j))) {
                    answer += 1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();

        // s1 입력 받기
        while (true) {
            String input = sc.next();
            if (input.equals("1")) {
                break;
            }
            s1.add(input);
        }

        // s2 입력 받기
        while (true) {
            String input = sc.next();
            if (input.equals("1")) {
                break;
            }
            s2.add(input);
        }

        int result = solution(s1, s2);
        System.out.println(result);
    }
}