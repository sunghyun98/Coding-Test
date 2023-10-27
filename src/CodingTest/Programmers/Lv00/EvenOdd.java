package CodingTest.Programmers.Lv00;

/*
정수가 담긴 리스트 num_list가 주어질 때,
num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을
 return 하도록 solution 함수를 완성해보세요.
 */
public class EvenOdd {
    public static void main(String[] args) {
        int result = 0;
        int a = 15;
        String aa = Integer.toString(a);
        for (int i = 0; i < aa.length(); i++) {
            char digit = aa.charAt(i); // 문자열에서 각 자릿수를 가져옴
            int num = Character.getNumericValue(digit); // 문자를 정수로 변환
            result += num;
        }

        System.out.println(result);
    }
}
