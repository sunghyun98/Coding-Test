package CodingTest.greed;

import java.util.Scanner;


/*상근이는 2863번에서 표를 너무 열심히 돌린 나머지 5와 6을 헷갈리기 시작했다.
상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는
 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 이때,
상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.
배열로 받아서 각 자리의 숫자를 5일때 6으로 변화하여 출력 시켜서 더하면 최댓값
6을 5로 변화 시켜서 출력하면 최솟값
 */
public class Five {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    String a = scanner.next();
    String b = scanner.next();

    StringBuilder minA = new StringBuilder();
    StringBuilder maxA = new StringBuilder();
    StringBuilder minB = new StringBuilder();
    StringBuilder maxB = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == '5') {
            maxA.append('6');
        } else {
            maxA.append(a.charAt(i));
        }
        if (a.charAt(i) == '6') {
            minA.append('5');
        } else {
            minA.append(a.charAt(i));
        }
    }
        for (int i = 0; i < b.length(); i++) {
        if (b.charAt(i) == '5') {
            maxB.append('6');
        } else {
            maxB.append(b.charAt(i));
        }
        if (a.charAt(i) == '6') {
            minB.append('5');
        } else {
            minB.append(b.charAt(i));
        }
    }
    int min = Integer.parseInt(minA.toString()) + Integer.parseInt(minB.toString());
    int max = Integer.parseInt(maxA.toString()) + Integer.parseInt(maxB.toString());
        System.out.println(min + " " + max);
}
}


