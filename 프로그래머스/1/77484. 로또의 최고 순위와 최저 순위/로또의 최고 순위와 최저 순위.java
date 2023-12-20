import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int tmp = 0;
        int right=0;
        int rank = 6;
        int win = 1;
        List<Integer> list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());
        
        Arrays.sort(lottos);

        
        for(int i = 0; i<lottos.length;i++){
            if(lottos[i]==0){
                tmp++;
            }  
            else if(list.contains(lottos[i])){
                right++;
                if(right>1)
                    rank--;
            }else
                win++;
            
        }
        if(win >6)
            win = 6;
        answer[0]=win;
        answer[1]=rank;
        
        return answer;
    }
}