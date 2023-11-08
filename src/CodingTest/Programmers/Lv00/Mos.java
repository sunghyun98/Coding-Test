package CodingTest.Programmers.Lv00;

public class Mos {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        String mos[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";

        String []mosa = letter.split(" ");

        for (int i = 0; i< mosa.length; i++){
            for (int j = 0; j < mos.length; j++){
                if(mosa[i].equals(mos[j])){
                    answer  += Character.toString((char) (j + 'a'));
                }
            }
        }
        System.out.println(answer);
    }
}
