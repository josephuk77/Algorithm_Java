class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length()/n;
        int s = 0;
        if(my_str.length()%n!=0)
            length++;
        
        String[] answer = new String[length];
        
        for(int i = 0; i<answer.length;i++){
            if(s+n>my_str.length()){
                answer[i] = my_str.substring(s,my_str.length());
            }else{
                answer[i] = my_str.substring(s,s+n);
            }
            s += n;
            
        }
        
        return answer;
    }
}