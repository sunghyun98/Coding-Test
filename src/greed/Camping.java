package greed;

import java.util.Scanner;

/**
 * 등산가 김강산은 가족들과 함께 캠핑을 떠났다. 하지만,
 * 캠핑장에는 다음과 같은 경고문이 쓰여 있었다.
 * 캠핑장은 연속하는 20일 중 10일동안만 사용할 수 있습니다.
 * 강산이는 이제 막 28일 휴가를 시작했다. 이번 휴가 기간 동안 강산이는 캠핑장을
 * 며칠동안 사용할 수 있을까?
 * <p>
 * 강산이는 조금 더 일반화해서 문제를 풀려고 한다.
 * 캠핑장을 연속하는 P일 중, L일동안만 사용할 수 있다.
 * 강산이는 이제 막 V일짜리 휴가를 시작했다.
 * 강산이가 캠핑장을 최대 며칠동안 사용할 수 있을까? (1 < L < P < V)
 */
public class Camping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int l = scanner.nextInt(); //사용가능한 횟수
            int p = scanner.nextInt(); //몇일중
            int v = scanner.nextInt(); //휴가
            int ct = 0;
            int i = 1;

            if (l == 0 && p == 0 && v == 0) {
                break;
            }
            ct = ((v / p) * l) + (v % p);
            if (v % p > l) {
                ct = (v / p) * l + p;
            }

            System.out.println("Case " + i + ":" + ct);
            i++;
        }
    }

}

