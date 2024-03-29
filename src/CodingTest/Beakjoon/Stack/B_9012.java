package CodingTest.Beakjoon.Stack;

import java.util.Scanner;
import java.util.Stack;

/*
괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’
만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다.
 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” ,
 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다.

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다.

 (
 (
 )
 )
 (
 )
 */
public class B_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 입력 버퍼에서 개행 문자 처리

        for (int i = 0; i < N; i++) {
            String Parenthesis = sc.nextLine();
            if (isVPS(Parenthesis)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
    public static boolean isVPS(String Parenthesis) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < Parenthesis.length(); j++) {
            char ch = Parenthesis.charAt(j);

            if (ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false; // 스택이 비어있는데 닫힌 괄호가 나오면 VPS가 아님
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty(); // 모든 괄호가 올바르게 열고 닫혀야 VPS
    }
}