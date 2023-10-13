package CodingTest.Beakjoon.자료구조.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
자바에서 기본적으로 많이 사용되는 클래스
자바의 List 인터페이스를 상속받은 여러 클래스 중 하나

배열과의 차이점은 배열의 크기가 가변적으로 변한다.

 */
public class ArrayListExample {
    public static void main(String[] args) {

        //ArrayList 생성
        List<Integer> integers0 = new ArrayList<Integer>(); // 타입 지정 1
        ArrayList<Integer> integers1 = new ArrayList<Integer>(); // 타입 지정 2
        ArrayList<Integer> integers2 = new ArrayList<>(); // 타입 생략 가능
        ArrayList<Integer> integers3 = new ArrayList<>(10); // 초기 용량(Capacity) 설정
        ArrayList<Integer> integers4 = new ArrayList<>(integers1); // 다른 Collection값으로 초기화
        ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()

        //추가 / 변경
        ArrayList<String> colors = new ArrayList<>();
        // add() method
        colors.add("Black");
        colors.add("White");
        colors.add(0, "Green");
        colors.add("Red");

        // set() method
        colors.set(0, "Blue");

        System.out.println(colors);


        //커스텀 한 리스트 타입을 생성 / 카피후 삭제
        System.out.println("==ArrayList 복사");
        ArrayList<Color> colorArrayList = new ArrayList<Color>();
        colorArrayList.add(new Color("Black",1000));
        colorArrayList.add(new Color("White",2000));
        System.out.println("커스텀 리스트 생성");
        System.out.println(colorArrayList);

        // 2. ArrayList 복사 - clone()
        ArrayList<Color> copycolorArrayList = (ArrayList<Color>) colorArrayList.clone();

        // 3. 복사된 결과 출력
        System.out.println("=== ArrayList 복사(clone()) ===");
        System.out.println("colorArrayList : " + colorArrayList);  // [[ Black: 1000 ], [ White: 2000 ]]
        System.out.println("copycolorArrayList : " + copycolorArrayList); // [[ Black: 1000 ], [ White: 2000 ]]

        // 4. 원본 ArrayList 변경
        colorArrayList.add(new Color("Yello", 500));

        // 4. 원본 ArrayList의 apple의 price 변경
        Color Black = colorArrayList.get(0);
        Black.setPrice(100);



        // 5. 결과 출력
        System.out.println("=== 원본 ArrayList의 apple의 price 변경 ===");
        System.out.println("colorArrayList : " + colorArrayList);  // [[ Black: 100 ], [ White: 2000 ]]
        System.out.println("copycolorArrayList : " + copycolorArrayList); // [[ Black: 100 ], [ White: 2000 ]]


    }

}
class Color {
    private String colorName;
    private int price;

    public Color(String colorName, int price) {
        this.colorName = colorName;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[ " + this.colorName + ": " + this.price + " ]";
    }
}
