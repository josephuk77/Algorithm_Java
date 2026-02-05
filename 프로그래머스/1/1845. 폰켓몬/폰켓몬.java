import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> num = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            num.add(nums[i]);
        }
        if(nums.length/2 > num.size() )
            answer = num.size();
        else
            answer = nums.length/2;
        
        return answer;
    }
}