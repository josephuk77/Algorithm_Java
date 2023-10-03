class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] keytmp = new int[keymap.length];
        int res = 0;
        int tmp1 = 0;
        int tmp2 = 1000;
        
        
        for(int i=0;i<targets.length;i++){
            for(int j=0; j<targets[i].length();j++){
                char target= targets[i].charAt(j);
                for(int k = 0; k<keymap.length;k++){
                    tmp1 = keymap[k].indexOf(target);
                    if(tmp2>tmp1 && tmp1 != -1)
                        tmp2 = tmp1;
                }
                if(tmp2 != 1000){
                    res += tmp2+1;
                    tmp2 = 1000;
                }else{
                    res = -1;
                    break;
                }
            }
            answer[i]= res;
            res = 0;
        }
        return answer;
    }
}