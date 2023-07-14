package CodingTest.greed;

import java.util.Scanner;

/**
 * 영학이는 딸기우유, 초코우유, 바나나우유를 좋아한다.
 *
 * 입맛이 매우 까다로운 영학이는 자신만의 우유를 마시는 규칙이 있다.
 *
 * 맨 처음에는 딸기우유를 한 팩 마신다.
 * 딸기우유를 한 팩 마신 후에는 초코우유를 한 팩 마신다.
 * 초코우유를 한 팩 마신 후에는 바나나우유를 한 팩 마신다.
 * 바나나우유를 한 팩 마신 후에는 딸기우유를 한 팩 마신다.
 * 영학이는 우유 축제가 열리고 있는 우유거리에 왔다. 우유 거리에는 우유 가게들이 일렬로 늘어서 있다.
 *
 * 영학이는 우유 거리의 시작부터 끝까지 걸으면서 우유를 사먹고자 한다.
 *
 * 각각의 우유 가게는 딸기, 초코, 바나나 중 한 종류의 우유만을 취급한다.
 *
 * 각각의 우유 가게 앞에서, 영학이는 우유를 사마시거나, 사마시지 않는다.
 *
 * 우유거리에는 사람이 많기 때문에 한 번 지나친 우유 가게에는 다시 갈 수 없다.
 *
 * 영학이가 마실 수 있는 우유의 최대 개수를 구하여라.
 *
 * 0은 딸기우유만을 파는 가게,
 * 1은 초코우유만을 파는 가게,
 * 2는 바나나우유만을 파는 가게를 뜻하며
 *
 * 0, 1 , 2, 0 , 1 ,2
 *
 *
 */
public class Milk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int milk[] = new int[N]; //우유가게 저장
        int ctt = 0; //철수가 먹은 우유 수
        int n = 0; //철수가 다음 먹을 우유를 저장함
        for (int i = 0; i<N; i++){
            milk[i] = scanner.nextInt();
        }
        //m[0]   [1] [2] [3] [4]
        // 0      2    1  2   0
        //ctt(0) ctt(1)
        //1
        for (int i = 0; i < N; i++){
            if (milk[i]== ctt ){
                ctt += 1;
                n +=1;
                if (milk[i] == 2){
                    ctt -= 3;
                }
            }
        }
        System.out.println(n);
    }
}