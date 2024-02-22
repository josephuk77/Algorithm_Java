class Solution {
    public int[] solution(String myString) {
        int count = 0;
        int j = 0;
        for(int i = 0; i<myString.length();i++){
            if(myString.charAt(i) == 'x')
                count++;
        }
        int[] answer = new int[count+1];
        count = 0;
        for(int i = 0; i<myString.length();i++){
            if(myString.charAt(i)=='x'){
                answer[j] = count;
                j++;
                count = 0;
            }else if(i==myString.length()-1){
                answer[j] = count+1;
            }else{
                count++;
            }
        }
        return answer;
    }
}