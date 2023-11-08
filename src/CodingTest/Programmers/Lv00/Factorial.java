package CodingTest.Programmers.Lv00;
/*
1*2*3*4
 */
public class Factorial {
    public static void main(String[] args) {
        int answer = 1;
        int factorial = 1;
        int n = 7;
        while (factorial <= n) {
            answer++;
            factorial *= answer;
        }
        System.out.println(answer-1);
    }
}
