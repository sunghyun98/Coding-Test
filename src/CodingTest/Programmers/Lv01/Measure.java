package CodingTest.Programmers.Lv01;

public class Measure {
    int solution(int n) {
        int answer = 0;
        int a = n;
        for (int i = 1; i < n; i++){
            if(a % i == 0){
                answer += 1;
            }
        }
        return answer;
    }

}
