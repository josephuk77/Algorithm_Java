import java.util.Arrays;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        int tmp = 0;
        if(s%n==0){
            for(int i = 0;i<n;i++){
                answer[i]=s/n;
            }
        }else if(n>s){
            int[] result = {-1};
            return result;
        }else{
            tmp=s%n;
            for(int i = 0;i<n;i++){
                answer[i]=s/n;
            }
            for(int j = 0; j<tmp;j++){
                answer[j]++;
            }
            Arrays.sort(answer);
        }
        
        return answer;
    }
}