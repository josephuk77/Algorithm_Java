import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        // 전체 예산은 정해져있음
        // 각 부서가 신청한 금액만큼은 전액 지원해야함
        // 최대 몇개의 부서에 물품을 지원할 수 있는지 계산 

        // 정렬 후 차례대로 예산이 줄어들때까지 지원한다.
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i < d.length; i++) {
            if(budget < d[i]) {
                break;
            }
            budget -= d[i];
            answer++;
        }
        return answer;
    }
}