package floyd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 무게가 서로 다른 N 개의 물건이 있다. 각 물건은 1부터 N 까지 번호가 매겨져 있다.
 * 우리는 일부 물건 쌍에 대해서 양팔 저울로 어떤 것이 무거운 것인지를 측정한 결과표를 가지고 있다.
 * 이 결과표로부터 직접 측정하지 않은 물건 쌍의 비교 결과를 알아낼 수도 있고 알아내지 못할 수도 있다.
 * 예를 들어, 총 6개의 물건이 있고, 다음 5개의 비교 결과가 주어졌다고 가정하자. ([1]은 1번 물건의 무게를 의미한다.)
 *
 * [1]>[2], [2]>[3], [3]>[4], [5]>[4], [6]>[5]
 *
 * 우리는 [2]>[3], [3]>[4]로부터 [2]>[4]라는 것을 알 수 있다.
 * 하지만, 물건 2와 물건 6을 비교하는 경우, 앞서의 결과만으로는 어느 것이 무거운지 알 수 없다.
 * 이와 같이, 물건 2는 물건 1, 3, 4와의 비교 결과는 알 수 있지만, 물건 5, 6과의 비교 결과는 알 수 없다.
 * 물건 4는 모든 다른 물건과의 비교 결과를 알 수 있다.
 *
 * 비교 결과가 모순되는 입력은 없다고 가정한다. 위 예제의 기존 측정 결과에 [3]>[1]이 추가되었다고 가정하자.
 * 이 경우 [1]>[2], [2]>[3]이므로 우리는 [1]>[3]이라는 것을 예측할 수 있는데,
 * 이는 기존에 측정된 결과 [3]>[1]과 서로 모순이므로 이러한 입력은 가능하지 않다.
 *
 * 물건의 개수 N 과 일부 물건 쌍의 비교 결과가 주어졌을 때,
 * 각 물건에 대해서 그 물건과의 비교 결과를 알 수 없는 물건의 개수를 출력하는 프로그램을 작성하시오.
 *
 */
//public class B10159 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        int M = Integer.parseInt(br.readLine());
//
//        int [][] number = new int[N][N];
//
//        for (int i = 0; i < M; i++){
//            int a = Integer.parseInt(br.readLine());
//            int b = Integer.parseInt(br.readLine());
//            number[a][b] = 1;
//        }
//        for (int k = 0; k < N; k++){
//            for (int i = 0; i <N; i++){
//                for (int j = 0; j < N; j++){
//                    if (number[][])
//                }
//            }
//        }
//    }
//}
