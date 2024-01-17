import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int f_result = 0;
        int s_result = 0;
        int t_result = 0;
        int f = 0;
        int s = 0;
        int t = 0;
        
        for(int i = 0; i<answers.length;i++){
            if(first.length == f)
                f -= first.length;
            if(second.length == s)
                s -= second.length;
            if(third.length == t)
                t -= third.length;
            if(first[f] == answers[i])
                f_result++;
            if(second[s] == answers[i])
                s_result++;
            if(third[t] == answers[i])
                t_result++;
            f++;
            s++;
            t++;
        }
        List<Integer> list = new ArrayList<>();
        if(f_result>s_result&&f_result>t_result)
            list.add(1);
        else if(s_result>f_result&&s_result>t_result)
            list.add(2);
        else if(t_result>s_result&&t_result>f_result)
            list.add(3);
        
        else if(f_result==s_result&&s_result==t_result){
            list.add(1);
            list.add(2);
            list.add(3);
        }else if(f_result==s_result){
            list.add(1);
            list.add(2); 
        }else if(s_result==t_result){
            list.add(2);
            list.add(3);
        }else if(f_result==t_result){
            list.add(1);
            list.add(3);
        }
        System.out.println(f_result);
        System.out.println(s_result);
        System.out.println(t_result);

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}