package CodingTest.Beakjoon.자료구조.List;

import java.util.*;

/*
T는 객체 타입을 의미하며 기본적으로
Integer, String, Double, Long 같은 Wrapper Class부터
사용자 정의 객체까지 가능하다.
ex) LinkedList<Integer> list = new LinkedList<>();
primitive type은 불가능하다.
*/

/*

ArrayList:
ArrayList는 가장 일반적인 동적 배열로, 크기를 동적으로 조절할 수 있습니다.
원소에 대한 빠른 랜덤 액세스가 가능하며, 중간에 요소를 삽입하거나 삭제할 때는 다른 요소들을 복사해야 할 수 있습니다.
배열로 구현되어 있으며, 크기를 늘리는 작업은 비용이 발생할 수 있습니다.
동적으로 크기가 조절되므로 요소 추가/삭제에 유용합니다.
LinkedList:

LinkedList는 이중 연결 리스트로 구현되어 있어 요소의 삽입과 삭제가 효율적입니다.
랜덤 액세스가 상대적으로 느립니다. 요소에 접근할 때 처음부터 찾아야 합니다.
중간에 요소를 삽입/삭제하거나 요소 간의 연결을 유지해야 할 때 유용합니다.
Vector:

Vector는 스레드 안전한 동적 배열입니다. 여러 스레드에서 동시에 접근해도 안전하게 사용할 수 있습니다.
대부분의 메소드는 synchronized 키워드를 사용하여 동기화되므로, 성능 면에서는 ArrayList보다 느릴 수 있습니다.
Java 1.0부터 존재하며, 이전 버전과의 호환성을 위해 남아있습니다. 새로운 코드에서는 ArrayList나 LinkedList를 사용하는 것이 좋습니다.
Stack:

Stack은 스택 자료구조를 나타내는 클래스로, Vector를 상속받아 구현됩니다.
후입선출(LIFO) 원칙에 따라 요소를 추가(push)하거나 제거(pop)할 수 있습니다.
주로 스택 자료구조를 구현하고자 할 때 사용됩니다. Java에서는 일반적으로 ArrayList나 LinkedList를 스택으로 활용하는 것이 더 권장됩니다.
방법 1은 각 컬렉션 타입을 직접 명시하고 객체를 생성하는 방법입니다. 방법 2는 다형성을 활용하여 List 인터페이스를 사용하고 실제 구현 클래스는 런타임에 선택할 수 있게 해줍니다. 이렇게 하면 코드가 보다 유연해집니다.

많은 경우에는 방법 2를 사용하는 것이 좋습니다. Java에서는 인터페이스를 사용하여 프로그래밍하면 코드의 확장성과 유지 보수성이 높아지기 때문입니다.
 */
public class ListTest {
    public static void main(String[] args) {
        // 방법 1
        ArrayList<Integer> arraylist = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Vector<Integer> vector = new Vector<>();
        Stack<Integer> stack = new Stack<>();

// 방법 2
        List<Integer> arraylist1 = new ArrayList<>();
        List<Integer> linkedlist1 = new LinkedList<>();
        List<Integer> vector1 = new Vector<>();
        List<Integer> stack1 = new Stack<>();

// Stack은 Vector를 상속하기 때문에 아래와 같이 생성할 수 있다.
        Vector<Integer> stack2 = new Stack<>();
    }
}
