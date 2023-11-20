class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        for(int i=0; i<count; i++){
            total+= price*(i+1);
        }
        answer = total - money;
        System.out.println(answer);
        if(answer>0)
            return answer;
        return 0;
        
    }
}