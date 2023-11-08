package CodingTest.Programmers.Lv00;

public class Kcount {
    public static void main(String[] args) {
        int i = 10;
        int j = 50;
        int k = 1;

        int result = 0;
        for(int a = i; a <= j; a++){
            String j1 = String.valueOf(a);
            for (int a1 = 0; a1 < j1.length(); a1++){

                if (j1.charAt(a1) == (char)(k + '0')){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
