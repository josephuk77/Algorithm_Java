class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int tmp = 0;
        if(sides[0]>sides[1]){
            tmp = sides[0];
            for(int i = 1; i<=tmp;i++){
                if(tmp<sides[1]+i)
                    answer++;
            }
            for( int i = tmp +1 ; i<sides[0]+sides[1];i++){
                answer++;
            }
        }
        else{
            tmp = sides[1];
            for(int i = 1; i<=tmp;i++){
                if(tmp<sides[0]+i)
                    answer++;
            }
            for( int i = tmp +1 ; i<sides[0]+sides[1];i++){
                answer++;
            }
        }
        
            
        
        return answer;
    }
}