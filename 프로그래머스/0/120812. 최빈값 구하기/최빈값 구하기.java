import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : array){
            map.put(i,map.getOrDefault(i,1) + 1);
        }
        int max = 0;
        int result = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            }else if(entry.getValue() == max)
                result = -1;
        }
        return result;
    }
}