package greed;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * 최근 들어 개인정보 유출에 대한 뉴스를 많이 본 수형이는 한 사이트의 비밀번호가 유출 되더라도 다른 사이트에서
 * 똑같은 비밀번호로 접속할 수 없도록 사이트마다 비밀번호를 다르게 설정하기로 다짐했다. 많이 고민한 결과 수형이는
 * 눈을 감고 키보드를 막 쳐서 나온 두 문자열에서 공통으로 존재하는 가장 긴 부분 문자열을 비밀번호로 하기로 하였다.
 * 수형이가 눈을 감고 만든 두 문자열이 주어졌을 때 비밀번호를 만드는 프로그램을 만들어보자.
 *
 *첫째 줄과 둘째 줄에 수형이가 눈을 감고 만든 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며,
 * 길이는 최대 40자이다. 빈 문자열은 주어지지 않는다. 가장 긴 부분 문자열은 반드시 하나만 존재한다.
 *
 * BufferedReader : Scanner
 * BufferedWriter : System.out.println(); 과 같은 기능을 한다고 한다.
 *
 * readLine()은 return값을 String으로 고정하기에
 * String이 아닌 다른 type으로 입력을 받으려면 형 변환을 꼭 해주어야한다.
 *
 * readLine() =>throws IOException으로 예외처리를 해줘야 한다.
 *
 * BufferedWriter와 같은 경우 버퍼를 잡아놓았기 때문에 flush() / close()를 반드시 호출에 주어 뒤처리를 해주어야 한다.
 * bw.write는 System.out.println();과 같이 자동개행이 되지 않아
 * \n 이스케이프 시퀸스를 사용하여야 한다.
 */
public class RandomPwd {
    public static int N, M;
        public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<N; i++) {
            String str = br.readLine();
            String arr[] = str.split(" ");

            map.put(arr[0], arr[1]);
        }

        for(int j=0; j<M; j++) {
            String get = br.readLine();

            System.out.println(map.get(get));
        }

    }

}
