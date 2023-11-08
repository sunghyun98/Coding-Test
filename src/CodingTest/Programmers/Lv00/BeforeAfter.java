package CodingTest.Programmers.Lv00;

import java.util.Arrays;

public class BeforeAfter {
    public static void main(String[] args) {
        String before = "hello";
        String after = "olleh";
        char[] beforeResult = before.toCharArray();
        char[] afterResult = after.toCharArray();

        Arrays.sort(beforeResult);
        Arrays.sort(afterResult);

        int answer = 0;

        if (Arrays.equals(beforeResult,afterResult)){
            answer = 1;
        }
        System.out.println(answer);

    }
}
