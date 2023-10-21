package CodingTest.Programmers.Lv00;

public class Char_in {
    public static void main(String[] args) {String str1 = "asdfzxcv";
        String str2 = "sd3f";

        int j = 0;
        int answer = 2;

        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i)==str2.charAt(j)){
                j++;
                if (str2.length()== j){
                    answer = 1;
                    break;
                }
            }
        }

        System.out.println();
    }
}
