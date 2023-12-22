class Solution {
    public String[] solution(String[] names) {
        int leng = names.length/5;
        if(names.length%5!=0)
            leng++;
        String[] answer = new String[leng];
        for(int i = 0; i<answer.length;i++){
            answer[i] = names[i*5];
        }
        return answer;
    }
}