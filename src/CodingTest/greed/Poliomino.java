package CodingTest.greed;

import java.io.*;
//throws IOException사용하기 위해서 임포트


/**
 * 민식이는 다음과 같은 폴리오미노 2개를 무한개만큼 가지고 있다. AAAA와 BB
 * 이제 '.'와 'X'로 이루어진 보드판이 주어졌을 때,
 * 민식이는 겹침없이 'X'를 모두 폴리오미노로 덮으려고 한다.
 * 이때, '.'는 폴리오미노로 덮으면 안 된다.
 * 폴리오미노로 모두 덮은 보드판을 출력하는 프로그램을 작성하시오.
 * xxxx....xxxxxx...
 * 4 2
 * AAAA BB
 */
public class Poliomino {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        str=polyomino1(str);
        bw.write(str);
        bw.flush();
        bw.close();
        br.close();
    }


    public static String polyomino1(String str) {
        str= str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");
        if(str.contains("X")) {
            str="-1";
        }
        return str;
    }
}