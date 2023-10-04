import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char tmpS=' ';
        char[] charArray = skip.toCharArray();
        
        // 문자 배열을 정렬
        Arrays.sort(charArray);
        
        
        for(int i = 0; i<s.length();i++){
            tmpS = s.charAt(i);
            for(int j = 0; j<index; j++){
                if(tmpS+1>122)
                    tmpS = 'a';
                else
                    tmpS++;
                for(int k = 0; k<skip.length(); k++){
                    if(tmpS == charArray[k] &&tmpS != 122){
                        tmpS++;
                        k=-1;
                    }else if(tmpS == 123 || (charArray[k]=='z'&& tmpS == 'z')){
                        tmpS = 'a';
                        k=-1;
                    }
                       
                    
                }
            }
            answer = answer + (char)tmpS;
        }
        return answer;
    }
}