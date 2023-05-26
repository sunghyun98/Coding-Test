package Beakjoon;

import java.util.Scanner;

public class B_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[9][9];
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
                if (arr[i][j] > a){
                    a = arr[i][j];
                    b = i;
                    c = j;
                }
            }
        }
        System.out.println(a);
        System.out.println((b+1)+" "+(c+1));
    }
}
