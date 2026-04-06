import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        
        for (int i = 0; i < query.length; i++) {
            int q = query[i];
            
            if (i % 2 == 0) { 
                end = start + q;
            } else { 
                start = start + q;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            answer.add(arr[i]);
        }
        
        return answer;
    }
}