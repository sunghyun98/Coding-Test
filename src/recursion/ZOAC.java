package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2018년 12월, 처음 시작하게 된 ZOAC의 오프닝을 맡은 성우는 누구보다 화려하게 ZOAC를 알리려 한다.
 * <p>
 * 앞 글자부터 하나씩 보여주는 방식은 너무 식상하다고 생각한 성우는 문자열을 보여주는 새로운 규칙을 고안해냈다!
 * <p>
 * 규칙은 이러하다. 아직 보여주지 않은 문자 중 추가했을 때의 문자열이 사전 순으로 가장 앞에 오도록 하는 문자를 보여주는 것이다.
 * <p>
 * 예를 들어 ZOAC를 보여주고 싶다면, A → AC → OAC → ZOAC 순으로 보여주면 된다.
 * <p>
 * 바쁜 성우를 위하여 이 규칙대로 출력해주는 프로그램을 작성하시오.
 */
public class ZOAC {
    private static BufferedReader br;
    private static StringBuilder sb = new StringBuilder();
    static String input;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();

        visited = new boolean[input.length()];
        zoac(0, input.length() - 1);

        br.close();
        System.out.println(sb.toString());

    }

    private static void zoac(int left, int right) throws IOException {
        if(left > right)return; //재귀 종료

        int index = left;

        for (int i = left; i <= right; i++){
            if (input.charAt(index) > input.charAt(i)){
                index = i;
            }
        }
        visited[index] = true;

        for (int i = 0; i < input.length(); i++){
            if (visited[i]) {
                sb.append(input.charAt(i));
            }
        }sb.append('\n');

        zoac(index+1, right);
        zoac(left,index-1);

    }
}