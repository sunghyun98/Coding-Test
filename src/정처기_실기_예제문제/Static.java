package 정처기_실기_예제문제;

class Static {
    public int a = 20;
    static int b = 0;
    public static void main(String[] args) {
        int a;
        a = 10;
        Static.b = a;
        Static st = new Static();
        System.out.println(Static.b++);
        System.out.println(st.b);
        System.out.println(a);
        System.out.println(st.a);
    }
}