import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        
        for(int i = 0; i < 5; i++){
            Arrays.sort(num_list);
            answer[i] = num_list[i];
        }
        return answer;
    }
}