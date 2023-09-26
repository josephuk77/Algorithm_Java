class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        for(int i = c-1; i<my_string.length();){
            answer = answer+my_string.charAt(i);
            i=i+m;
        }
            
        return answer;
    }
}