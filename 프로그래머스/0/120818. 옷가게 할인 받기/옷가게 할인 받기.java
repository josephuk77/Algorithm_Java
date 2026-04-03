class Solution {
    public int solution(int price) {
        int answer = 0;
        if(500000 <= price){
            answer = price * 8 / 10;
        }else if(300000 <= price) {
            answer = price * 9 / 10;
        }else if(100000 <= price) {
            answer = price * 95 / 100;
        }else{
            answer = price;
        }
        return answer;
    }
}