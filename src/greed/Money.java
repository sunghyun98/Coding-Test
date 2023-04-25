package greed;

import java.util.Scanner;

/*춘향이는 편의점 카운터에서 일한다.
손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다.
2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다.
동전의 개수가 최소가 되도록 거슬러 주어야 한다. 거스름돈이 n인 경우,
최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
예를 들어, 거스름돈이 15원이면 5원짜리 3개를,
거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를,
거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
money(14원)%5 == money(4)
money(4)/2 == two(2)

money(13원)%5 == money(3)
money(3원)%2 == 1원

13원 % 5 == 3 + 5

 */
public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int coin = 0;
        while(true){
            if(n%5==0){ // 5로 나누어 떨어진다면
                coin += n/5; // 나눈 값 +
                break;
            } else {
                n -= 2; // 나누어 떨어지지 않으면 -2
                coin++;
            }
            if(n<0) { // 음수가 되면 거슬러 줄 수 없는 경우
                System.out.println(-1);
                return;
            }
        }
        System.out.println(coin);
    }
}

/* 내가 했던 코드

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int five = 0; //5원 짜리 동전의 개수
        int two = 0;  //2원 짜리 동전의 개수
        int a; //남은 돈이 저장될 변수
        int n = 0;

        a = money;
        while (a != 0) {
            System.out.println(n);
            a = money;

            five = a / 5;
            five -= n;

            a = a % 5;
            a += 5 * n;

            two = a / 2;
            a = a % 2;

            n += 1;
            if(a<0) {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(five);
        System.out.println(two);
    }
}

 */
