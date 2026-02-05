import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();

        for(String[] item : clothes) {
            String category = item[1];
            map.put(category, map.getOrDefault(category,0)+1);
        }
         int answer = 1;

        for(int cnt : map.values()) {
            answer *= (cnt + 1);
        }

        return answer - 1;
    }
}