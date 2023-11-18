package CodingTest.Programmers.Lv00;

import java.util.ArrayList;
import java.util.Arrays;

public class Factorization {
    public static void main(String[] args) {
        int n = 420;
        int a = n;
        ArrayList<Integer> a1 = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            while (true){
                if(a % i == 0){
                    a = a/i;
                    // 중복 체크
                    if (!a1.contains(i)) {
                        a1.add(i);
                    }

                } else {
                    break;
                }
            }
            if (a == 1){
                break;
            }
        }

        // ArrayList를 배열로 변환
        int[] answer = new int[a1.size()];
        for (int i = 0; i < a1.size(); i++){
            answer[i] = a1.get(i);
        }

        // 결과 확인
        System.out.println(Arrays.toString(answer));
    }
}
