package CodingTest.Programmers.Lv00;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Test {

    public int[] solution(int[] arr, int num1, int num2) {
        int[] result = new int[num2 - num1 + 1];
        int index = 0;

        for (int i = num1; i <= num2; i++) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = test.solution(arr, num1, num2);

        // 결과 출력
        System.out.print("Copied Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}