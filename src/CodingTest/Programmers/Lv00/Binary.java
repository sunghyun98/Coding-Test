package CodingTest.Programmers.Lv00;
//toBinaryString
public class Binary {
    public static void main(String[] args) {
        String answer = "";
        String bin1 = "10";
        String bin2 = "11";

        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        System.out.println(answer);

        }
    }

