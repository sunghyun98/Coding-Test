package 다이나믹;

import java.util.Scanner;

class B_2775{
    public static void main(String[] args) {
        int arr[][] = new int[15][15];
        //아파트의 층별 사람수를 입력할 2차원배열

        for(int i = 0; i < 15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for (int i1 = 1; i1 < 15; i1++){
            for (int i2 = 2; i2 < 15; i2++){
                arr[i1][i2] = arr[i1][i2-1] + arr[i1-1][i2];
            }
        }

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i2 = 0; i2 < test; i2++){
            int k = sc.nextInt();
            int o = sc.nextInt();

            System.out.println(arr[k][o]);
        }
    }
}
