package Beakjoon;

import java.util.Scanner;

/**
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 *     N = 5
 *     5*2-1
 *     9번
 *     1       1 // 1
 *     1 + 2 = 3 // 2
 *     3 + 2 = 5 // 3
 *     5 + 2 = 7 // 4
 *     7 + 2 = 9 // 5
 *
 *  1 3 5 7 9 7 5 3 1
 */
public class B_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 1;

        for (int i = 0; i < N; i++ ){
            for (int j = 0; j < a; j++ ){
                System.out.print("*");
            }
            a = a + 2;
            System.out.println();
        }
    }
}
