class Solution {
    public int solution(String s) {
        int answer = 0;
        int x=0;
        int xn=0;
        char tmp =' ';
        for(int i = 0;i<s.length();i++){
            if(tmp == ' ')
                tmp = s.charAt(i);
            if(tmp == s.charAt(i)){
                x++;
            }else{
                xn++;
            }
            if(x == xn){
                answer++;
                x=0;
                xn =0;
                tmp = ' ';
            }else if( x != xn && i==s.length()-1)
                answer++;
        }
        return answer;
    }
}