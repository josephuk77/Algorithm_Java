class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        for(int i=0;i<s;i++){
            answer = answer + my_string.charAt(i);
        }
        for(int j=e;s<=j;j--){
            answer = answer + my_string.charAt(j);
        }
        for(int k=e+1;k<my_string.length();k++){
            answer = answer + my_string.charAt(k);
        }
        return answer;
    }
}