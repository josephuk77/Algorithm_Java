import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(c>64 && c<91){
                c += n;
                if(c>90)
                    c -= 26;
                answer += c;
            } else if(c == 32){
                answer += c;
            } else {
                c += n;
                if(c>122)
                    c -= 26;
                answer += c;
            }
        }
        return answer;
    }
}