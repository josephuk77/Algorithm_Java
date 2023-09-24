import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        String res="";
        for(int j = 0; j<intStrs.length;j++){
             for(int i = 0;i<l;i++){
                res = res + intStrs[j].charAt(s+i); 
            }
            if(Integer.parseInt(res)>k){
                list.add(Integer.parseInt(res));
            }
            res="";
        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}