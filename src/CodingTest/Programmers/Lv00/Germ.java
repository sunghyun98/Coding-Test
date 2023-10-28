package CodingTest.Programmers.Lv00;
/*
어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 */
public class Germ {
    public int solution(double n, double t) {
        int answer = 0;
        answer = (int)(Math.pow(n,t));
        return answer;
    }
    public static void main(String[] args) {
        Germ germ = new Germ();
        int a = germ.solution(2,10);

        System.out.println(a);
    }
}
