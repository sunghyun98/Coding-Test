package CodingTest.Programmers.Lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
약수 구하기
 */
public class Measure {
    public int[] solution(int i){
        ArrayList <Integer> list = new ArrayList<>();
        for(int j = 1; j <= i; j++ ){
            if(i % j == 0){
                list.add(j);
            }
        }
        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
    public static void main(String[] args) {
        Measure ms = new Measure();
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] result;
        result = ms.solution(i);
        System.out.println(Arrays.toString(result));
    }
}
