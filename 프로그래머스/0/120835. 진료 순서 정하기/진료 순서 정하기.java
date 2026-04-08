import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sorted = emergency.clone(); // 원본 복사

        Arrays.sort(sorted);

        for (int i = 0; i < sorted.length / 2; i++) {
            int tmp = sorted[i];
            sorted[i] = sorted[sorted.length - 1 - i];
            sorted[sorted.length - 1 - i] = tmp;
        }

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sorted.length; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}