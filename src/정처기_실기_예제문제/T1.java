package 정처기_실기_예제문제;

public class T1 {
    static int count = 0;
    public int age = 0;
    public String name;
    T1(String name){
        this.name = name;
        count++;
        age++;
    }
    public void info(){
        System.out.println("count = "+ count);
        System.out.println(name +":"+ age);
    }
    public static void main(String[] args) {
        T1 p1 = new T1("김기수");
        p1.info();

        p1.count = 12;

        T1 p2 = new T1("김기수01");
        p2.info();
    }
}
