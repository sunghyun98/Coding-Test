package CodingTest.Programmers.Lv00;

public class SevenCount {
    public static void main(String[] args) {
        int array[] = {1, 32, 17};
        int answer = 0;


        for(int i = 0; i < array.length; i++){
            String num = Integer.toString(array[i]);
            String[] num1 = num.split("");
            for(int j = 0; j < num1.length; j++){
                if (num1[j].equals("7")){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
