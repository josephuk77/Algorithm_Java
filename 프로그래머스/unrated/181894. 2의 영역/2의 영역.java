import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        
        for (int num : arr) {
            list.add(num);
        }
        
        int firstIndex = list.indexOf(2); // 첫 번째 인덱스
        int lastIndex = list.lastIndexOf(2); // 마지막 인덱스
        
        if(firstIndex == -1){
            int[] answer = {-1};
            return answer;
        }else if(lastIndex == -1){
            int[] answer = {2};
            return answer;
        }else{
            int[] answer = new int[lastIndex - firstIndex + 1];
            for(int i = firstIndex; i<= lastIndex; i++){
                answer[j]= list.get(i);
                j++;
            }
            return answer;
        }
    }
}