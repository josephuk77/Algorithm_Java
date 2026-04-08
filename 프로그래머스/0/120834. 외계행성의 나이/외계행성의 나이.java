class Solution {
    public String solution(int age) {
        String answer = "";
        String ageS = Integer.toString(age);
        for(int i = 0; i < ageS.length(); i++){
             answer += (char)(ageS.charAt(i) + 'a' - '0');
        }
        return answer;
    }
}