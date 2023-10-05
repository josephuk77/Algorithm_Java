import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> list = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i<s.length();i++){
            if(tmp.lastIndexOf(s.charAt(i))==-1)
                list.add(-1);
            else
                list.add(tmp.length()-tmp.lastIndexOf(s.charAt(i)));
            tmp+=s.charAt(i);
        }
            
            
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}