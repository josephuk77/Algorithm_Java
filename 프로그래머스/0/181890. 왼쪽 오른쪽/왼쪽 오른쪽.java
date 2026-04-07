import java.util.*;

class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        int index = 0;
        String c = "";
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                index = i;
                c = "l";
                break;
            }else if(str_list[i].equals("r")){
                index = i;
                c = "r";
                break;
            }
        }
        if(c.equals("l")){
            for(int i = 0; i < index; i++) {
                answer.add(str_list[i]);
            }
        }else if(c.equals("r")){
            for(int i = index + 1; i < str_list.length; i++) {
                answer.add(str_list[i]);
            }
        }
        
        return answer;
    }
}