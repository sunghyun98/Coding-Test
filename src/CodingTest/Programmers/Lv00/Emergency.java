package CodingTest.Programmers.Lv00;

import java.util.Arrays;

public class Emergency {
    public static void main(String[] args) {
        int[] emergency = {3, 76, 23};
        int[] answer = new int[emergency.length];


        for (int i = 0; i < emergency.length; i++){
            System.out.println(emergency[i]);
            int t = 1;
            for (int j = 0; j < emergency.length; j++){
                if (emergency[i] < emergency[j]){
                    t++;
                }
            }
            System.out.println(t);
            answer[i] = t;
        }
    }
}
