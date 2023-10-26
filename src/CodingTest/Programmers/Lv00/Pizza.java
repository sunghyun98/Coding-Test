package CodingTest.Programmers.Lv00;

import java.util.Scanner;

public class Pizza {
    public int Solution (int n){
        int answer = 0;

        if (7/n==0){
            return answer = n/7+1;
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = pizza.Solution(N);

        System.out.println(result);
    }

}
