class Solution {
    public String solution(String[] seoul) {
        int location = 0;
        for (String s: seoul){
            if (s.equals("Kim")){
                break;
            } else {
                location +=1;
            }
        }
        
        return String.format("김서방은 %d에 있다", location);
    }
}