import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int currentDay = 0;
        int count = 0;

        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = (remain + speeds[i] - 1) / speeds[i];

            if (days > currentDay) {
                if (count > 0) {
                    answer.add(count);
                }

                currentDay = days;
                count = 1;
            } else {
                count++;
            }
        }

        answer.add(count);

            
        return answer;
    }
}