package greed;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 스네이크버드는 뱀과 새의 모습을 닮은 귀여운 생물체입니다.
 * <p>
 * 스네이크버드의 주요 먹이는 과일이며 과일 하나를 먹으면 길이가 1만큼 늘어납니다.
 * <p>
 * 과일들은 지상으로부터 일정 높이를 두고 떨어져 있으며 i (1 ≤ i ≤ N) 번째 과일의 높이는 hi입니다.
 * <p>
 * 스네이크버드는 자신의 길이보다 작거나 같은 높이에 있는 과일들을 먹을 수 있습니다.
 * <p>
 * 스네이크버드의 처음 길이가 L일때 과일들을 먹어 늘릴 수 있는 최대 길이를 구하세요.
 * <p>
 * 첫 번째 줄에 과일의 개수 N (1 ≤ N ≤ 1,000) 과 스네이크버드의 초기 길이 정수 L (1 ≤ L ≤ 10,000) 이 주어집니다.
 * <p>
 * 두 번째 줄에는 정수 h1, h2, ..., hN (1 ≤ hi ≤ 10,000) 이 주어집니다.
 * <p>
 * 첫째줄 개수 n, 길이 l
 * 둘째줄 정수 주어짐
 */
public class SnakeBurd {
    public static void main(String[] args) throws IOException {
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        //과일의 높이 저장

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);    //오름차순 정렬

        //낮은 과일부터 탐색 진행
        for (int i = 0; i < N; i++) {
            if (L >= arr[i])    //스네이크버드 길이보다 작거나 같으면 과일 섭취
                L++;    //길이 증가
        }
        bw.write(L + "");    //스네이크버드 길이 BufferedWriter 저장
        bw.flush();        //결과 출력
        bw.close();
        br.close();
    }
}

