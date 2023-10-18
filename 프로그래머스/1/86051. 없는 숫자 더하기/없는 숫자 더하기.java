import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int cs = 0;
        
        for(int i = 0;i<10; i++){
            if(cs< numbers.length && numbers[cs] == i)
                cs++;
            else
                answer += i;
        }
        
        return answer;
    }
}