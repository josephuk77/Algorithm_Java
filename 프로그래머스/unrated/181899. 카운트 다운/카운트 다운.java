import java.util.*;

class Solution {
    public int[] solution(int start, int end_num) {
        List<Integer> list = new ArrayList<>();
        
        for(; start>=end_num;start--){
            list.add(start);
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }
}