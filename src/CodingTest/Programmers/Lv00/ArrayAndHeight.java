package CodingTest.Programmers.Lv00;

import java.util.Scanner;

/*
머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
 */
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > height){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력 개수");
        int count = sc.nextInt();
        int arr[] = new int[count];

        System.out.println(count + "개의 숫자를 입력하세요 : ");
        for (int i = 0; i < count; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("머쓱이의 키를 입력해라.");
        int h = sc.nextInt();
        
        Solution solution = new Solution();
        int result = solution.solution(arr,h);

        System.out.println(result);
    }
}