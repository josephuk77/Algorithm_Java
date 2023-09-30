class Solution {
    public int[] solution(int[] arr) {
        int tmp=0;
        int k=0;
        
        for(int i=0; i<arr.length;i++){
            tmp += arr[i];
        }
        int[] answer = new int[tmp];
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                answer[k]=arr[i];
                k++;
            }
        }
        
        return answer;
    }
}