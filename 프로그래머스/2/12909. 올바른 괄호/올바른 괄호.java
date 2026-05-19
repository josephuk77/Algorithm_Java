class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int tmp = 0;
        for(int i = 0; s.length() > i; i++){
            if(s.charAt(i) == '('){
                tmp++;
            }else if(s.charAt(i) == ')'){
                if(tmp>0)
                    tmp--;
                else
                    return false;
            }
        }
        if(tmp != 0)
            return false;

        return answer;
    }
}