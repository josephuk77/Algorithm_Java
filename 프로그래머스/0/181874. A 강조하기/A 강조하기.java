class Solution {
    public String solution(String myString) {
        String s = myString.toLowerCase();
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            if(s.charAt(i) == 'a')
                answer += (char)(s.charAt(i) -'a' + 'A' );
            else
                answer += s.charAt(i);
        }
        return answer;
    }
}