package CodingTest.Programmers;

public class UseFunction {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i); // 문자열에서 현재 문자 추출
            if (Character.isDigit(ch)) { // 현재 문자가 숫자인지 확인
                int digit = Character.getNumericValue(ch); // 숫자 문자를 정수로 변환
                answer += digit; // 숫자를 더함
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        UseFunction useFunction = new UseFunction();
        String inputString = "dfa213sdf"; // 테스트용 입력 문자열
        int result = useFunction.solution(inputString); // 함수 호출
        System.out.println(result); // 결과 출력
    }
}
