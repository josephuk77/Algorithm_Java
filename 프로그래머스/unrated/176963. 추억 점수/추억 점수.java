import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int tmp = 0;
        Map<String,Integer> nameYearningMap = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for(int i = 0; i<name.length;i++){
            nameYearningMap.put(name[i],yearning[i]);
        }
        for(int j = 0; j<photo.length;j++){
            for(int k = 0; k<photo[j].length;k++){
                if (nameYearningMap.containsKey(photo[j][k])) {
                    tmp += nameYearningMap.get(photo[j][k]);
                } 
            }
            answer[j]=tmp;
            tmp=0;
        }
        
        return answer;
    }
}