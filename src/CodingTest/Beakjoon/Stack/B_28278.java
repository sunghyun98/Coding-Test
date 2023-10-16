package CodingTest.Beakjoon.Stack;


/*
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_28278 {

    public static int size = 0;
    public static int[] stackSave;
    public static int top = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stackSave = new int[N];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int search = Integer.parseInt(input[0]);
            switch (search) {
                case 1:
                    one(Integer.parseInt(input[1]));
                    break;
                case 2:
                    sb.append(two()).append("\n");
                    break;
                case 3:
                    sb.append(three()).append("\n");
                    break;
                case 4:
                    sb.append(four()).append("\n");
                    break;
                case 5:
                    sb.append(five()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }

    public static void one(int search) {
        if (top < stackSave.length - 1) {
            stackSave[++top] = search;
            size++;
        }
    }

    public static int two() {
        if (size == 0) {
            return -1;
        } else {
            int value = stackSave[top];
            stackSave[top--] = 0;
            size--;
            return value;
        }
    }

    public static int three() {
        return size;
    }

    public static int four() {
        if (size == 0) return 1;
        else return 0;
    }

    public static int five() {
        if (size > 0) return stackSave[top];
        else return -1;
    }
}