package CodingTest.Beakjoon;

import java.util.Scanner;

/**
 * 자연수 N과 정수 K가 주어졌을 때 이항계수를 구하여라
 */
public class B_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


    }

    int BC(int N, int K) {

        // 2번 성질
        if(N == K || K == 0) {
            return 1;
        }
        // 1번 성질
        return BC(N - 1, K - 1) + BC(N - 1, K);
    }
}
