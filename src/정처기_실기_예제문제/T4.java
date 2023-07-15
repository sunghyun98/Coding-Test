package 정처기_실기_예제문제;

public class T4 {
    public static void main(String[] args) {
        int i; // for 루프 외부에서 i를 선언
        for (i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("After the loop, i = " + i);
    }
}
