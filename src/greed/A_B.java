package greed;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.
 *
 * 2를 곱한다.
 * 1을 수의 가장 오른쪽에 추가한다.
 * A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.
 *
 * 입력
 * 첫째 줄에 A, B (1 ≤ A < B ≤ 109)가 주어진다.
 */

public class A_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BuffredReader 로 문자형 입력
        StringTokenizer st = new StringTokenizer(br.readLine());  //StringTokenizer 입력 받은 값을 토큰으로

        int A = Integer.parseInt(st.nextToken()); //A 값 정수형 토큰으로 반환
        int B = Integer.parseInt(st.nextToken()); //B 값 정수형 토큰으로 반환

        int answer = 1; //

        while (B != A)
        //B값이 A값과 같을때 까지 반복
            {
            if(B < A)
            //B값이 A값보다 작을 경우 // -1출력
            {
                System.out.println(-1);
                return;
            }

            String str = String.valueOf(B);
            //B값을 String형으로 변환
            if(B % 2 == 0)

            {
                B /= 2;
                System.out.println(B);

            } else if (str.charAt(str.length() - 1) == '1')
            //B의 값의 첫째 자리가 1일 경우 (charAt = String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환)
                //ex) B 값이 12341 일경우 str.charAT(str.lenght() -1) 은 1이다
                //substring(0. str.length() -1) => 0~4까지의 값을 str에 저장 = str = 1234

            {
                str = str.substring(0, str.length() - 1);
                B = Integer.parseInt(str);

            }else{
                System.out.println(-1);
                return;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
