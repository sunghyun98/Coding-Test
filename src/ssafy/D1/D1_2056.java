package ssafy.D1;

import java.util.Scanner;

public class D1_2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] MonthDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int test = sc.nextInt();

        for (int i = 0; i < test; i++){
            String num = sc.next();

            int year = Integer.parseInt(num.substring(0,4));
            int month = Integer.parseInt(num.substring(4,6));
            int day = Integer.parseInt(num.substring(6,8));
            boolean flag = true;

            if(year <=0 ){
                flag = false;
            }
            if (month )

        }

    }
}
