package CodingTest.Programmers.Lv00;

import java.util.Scanner;

public class WherePoint {
    public int solution(int[] dot) {
        int answer = 0;
        if(dot[0] > 0 && dot[1] >0) {
            return 1;
        }
        else if (dot[0] > 0 && dot[1] < 0) {
            return 4;
        } else if (dot[0]<0 && dot[1]<0) {
            return 3;
        }else return 2;

    }

    public static void main(String[] args) {
        WherePoint wherePoint = new WherePoint();
        Scanner sc = new Scanner(System.in);

        int[] dot = new int[2];

        for (int i = 0; i < 2; i++ ){
            dot[i] = sc.nextInt();
        }

        int result = wherePoint.solution(dot);

        System.out.println(result);
    }
}
