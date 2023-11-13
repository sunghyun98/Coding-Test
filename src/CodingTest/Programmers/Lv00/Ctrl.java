package CodingTest.Programmers.Lv00;

public class Ctrl {
    public static void main(String[] args) {
       String s = "1 2 Z 3";
        int answer = 0;

        String[] ctrl = s.split(" ");

        for(int i = 0; i < ctrl.length; i++){
            if(ctrl[i].equals("Z")){
                answer -= Integer.parseInt(ctrl[i-1]);
            }else{
                answer += Integer.parseInt(ctrl[i]);
            }
        }
        System.out.println(answer);;
    }
}
