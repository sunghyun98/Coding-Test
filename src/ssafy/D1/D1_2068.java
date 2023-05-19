package ssafy.D1;

import java.util.Scanner;

public class D1_2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++){
            int max = 0;
            for (int j = 0; j < 10; j++){
                int N = sc.nextInt();
                if(max < N)max = N;
            }
            System.out.format( "#%d %d\n",i, max);

        }
    }
}
