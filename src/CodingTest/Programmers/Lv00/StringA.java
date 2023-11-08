package CodingTest.Programmers.Lv00;

import java.util.Arrays;

public class StringA {
    public static void main(String[] args) {
        String my_string = "asdfFF";
        String answer = "";
        int array[] = new int[my_string.length()];
        char a;
        for(int i = 0; i < my_string.length(); i++){
            a = my_string.charAt(i);
            if( 65 <= my_string.charAt(i) &&   my_string.charAt(i) <= 90){
                a += 32;
            }
            array[i] = a;
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            answer += (char)array[i];
        }
        System.out.println(answer);
    }
}
