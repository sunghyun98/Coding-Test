package CodingTest.Programmers.Lv00;
/*
문자열 my_string이 매개변수로 주어집니다. my_string은 소문자,
대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을
 return하도록 solution 함수를 완성해주세요.
 */
public class HidingNum {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int temp = 0;
        int result = 0;
        char ch;
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        for (int i = my_string.length()-1; i >= 0; i--){
            ch = my_string.charAt(i);
            if (Character.isDigit(ch)){
                if (temp > 0 && Character.isDigit(ch)){

                    result += Character.getNumericValue(ch)*temp;
                    temp *= 10;
                    continue;
                }
                result += Character.getNumericValue(ch);
                temp = 10;

            }else {
                temp = 0;

            }
        }
        System.out.println(result);
    }
}
