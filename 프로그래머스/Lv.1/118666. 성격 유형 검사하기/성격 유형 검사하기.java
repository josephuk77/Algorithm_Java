import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        int j = 0;
        String answer = "";
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        
        for(int i : choices){
            i -= 4;
            if(i<0){
                map.put(survey[j].charAt(0), map.get(survey[j].charAt(0)) +  Math.abs(i));
            }else {
                map.put(survey[j].charAt(1), map.get(survey[j].charAt(1)) + i);
            }
            j++;
        }
        if(map.get('R')>=map.get('T'))
            answer+='R';
        else
            answer+='T';
        if(map.get('C')>=map.get('F'))
            answer+='C';
        else
            answer+='F';
        if(map.get('J')>=map.get('M'))
            answer+='J';
        else
            answer+='M';
        if(map.get('A')>=map.get('N'))
            answer+='A';
        else
            answer+='N';
        
        return answer;
    }
}