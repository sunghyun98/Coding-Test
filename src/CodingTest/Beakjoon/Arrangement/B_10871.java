package CodingTest.Beakjoon.Arrangement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 X보다 작은 수

 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 */
public class B_10871 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer를 사용하여 공백으로 분리된 입력 값을 읽습니다.
        StringTokenizer tk = new StringTokenizer(br.readLine());

        // 입력에서 N과 X를 읽습니다.
        int N = Integer.parseInt(tk.nextToken()); // N은 배열의 크기
        int X = Integer.parseInt(tk.nextToken()); // X보다 작은 수를 찾아야 합니다.

        // 결과를 저장할 StringBuilder를 생성합니다.
        StringBuilder sb = new StringBuilder();

        // StringTokenizer를 다시 사용하여 배열 A의 원소들을 읽고 처리합니다.
        tk = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(tk.nextToken()); // 배열 A의 각 원소를 읽습니다.

            // X보다 작은 원소인 경우 StringBuilder에 추가합니다.
            if (value < X)
                sb.append(value).append(' ');
        }

        // 결과를 출력합니다.
        System.out.println(sb);
    }
}