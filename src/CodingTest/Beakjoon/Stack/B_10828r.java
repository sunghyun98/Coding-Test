package CodingTest.Beakjoon.Stack;

import java.util.Scanner;

/*
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.

pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

size: 스택에 들어있는 정수의 개수를 출력한다.

empty: 스택이 비어있으면 1, 아니면 0을 출력한다.

top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class B_10828r {
    public static int[] stack;
    public static int size;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder st = new StringBuilder();

        int S = sc.nextInt();
        stack = new int[S];

        for (int i = 0; i < S; i++){
            String str = sc.next();

            switch (str){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    st.append(pop()).append("\n");
                    break;
                case "size":
                    st.append(size()).append('\n');
                    break;
                case "empty":
                    st.append(empty()).append('\n');
                    break;
                case "top":
                    st.append(top()).append('\n');
                    break;

            }
        }
        System.out.println(st);
    }
    public static void push(int a){
        stack[size] = a;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }

    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if (size == 0){
            return 1;
        }else {
            return 0;
        }
    }

    public static int top(){
        if(stack[size-1] == 0){
            return -1;
        }else {
            return stack[size-1];
        }
    }
}