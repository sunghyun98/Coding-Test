package CodingTest.Programmers.Lv00;

public class ArrCut02 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        String m = "";
        String answer[] = new String[my_str.length()/6];
        for (int j = 0; j < my_str.length()/6; j++){
            for (int i = 0; i < n; i++){
                m += my_str.charAt(i);
            }
        }
        //0 1 2 3 4 5 / 6 7 8 9 10 11 /
        System.out.println(m);
    }
}
